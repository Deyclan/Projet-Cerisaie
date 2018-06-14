package controle;

import java.io.IOException;
import javax.jms.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Date;
import java.text.SimpleDateFormat;


import javax.annotation.Resource;
import meserreurs.MonException;
import metier.InscriptionActivite;

@WebServlet("/Controleur")
public class Controleur extends HttpServlet {

    private static final long serialVersionUID = 10L;
    private static final String ACTION_TYPE = "action";
    private static final String AFFICHER_INSCRIPTION = "afficherInscription";
    private static final String ENVOI_INSCRIPTION = "envoiInscription";
    private static final String AFFICHER_ACTIVITES = "activities";
    private static final String DECONNEXION = "deconnexion";
    private static final String CONNEXION = "seConnecter";
    private int numLocation;
    private int numSejour;


    @Resource(lookup = "java:jboss/exported/topic/DemandeInscriptionJmsTopic")
    private Topic topic;

    @Resource(mappedName = "java:/ConnectionFactory")
    private TopicConnectionFactory cf;
    private TopicSession session = null;
    private TopicPublisher producer;

    public Controleur() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            TraiteRequete(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        try {
            TraiteRequete(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Procédure principale de démarrage
     */
    public void TraiteRequete(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // On récupère l'action
        String actionName = request.getParameter(ACTION_TYPE);
        // Si on veut afficher l'ensemble des demandes d'inscription
        if (CONNEXION.equals(actionName)) {
            // TODO : vérifier que n°séjour + n°emplacement existent et bons
            // TODO : set variables numSejour et numLocation
            request.getRequestDispatcher("/accueil.jsp").forward(request, response);
        }
        if (AFFICHER_ACTIVITES.equals(actionName)) {
            this.getServletContext().getRequestDispatcher("/activites.jsp").include(request, response);
        }
        if (AFFICHER_INSCRIPTION.equals(actionName)) {
            request.getRequestDispatcher("/inscription.jsp").forward(request, response);
        }
        if (ENVOI_INSCRIPTION.equals(actionName))
        {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            response.setContentType("text/html;charset=UTF-8");
            // On récupère les informations sisies
            // TODO : Modifier les getter param
            int codeSport = -1;
            Date dateJour = null;
            int numSej = -1;
            short nbLoc = -1;
            int nbFoisReserve = -1;

            codeSport = Integer.parseInt(request.getParameter("activity"));
            String dateJourString = request.getParameter("jourActivite");
            numSej = request.getParameter("");
            nbLoc = request.getParameter("");
            nbFoisReserve = Integer.parseInt(request.getParameter("nbActivite"));

            if (codeSport != -1 && dateJour != null && numSej != -1 && nbLoc != -1) {

                try {
                    // On récupère la valeur des autres champs saisis par
                    // l'utilisateur
                    // on transfome la date
                    // au format Mysql java.sql.Date
                    java.util.Date initDate = new SimpleDateFormat("dd/MM/yyyy").parse(dateJourString);
                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                    String parsedDate = formatter.format(initDate);
                    initDate= formatter.parse(parsedDate);
                    dateJour = new Date(initDate.getTime());

                    // On crée une demande d'inscription avec ces valeurs
                    InscriptionActivite inscription = new InscriptionActivite();
                    inscription.setCodeSport(codeSport);
                    inscription.setDateJour(dateJour);
                    inscription.setNbLoc(nbLoc);
                    inscription.setNumSej(numSej);

                    // On envoie cette demande d'inscription dans le topic
                    boolean ok = envoi(inscription);
                    if (ok)
                        // On retourne à la page d'accueil
                        this.getServletContext().getRequestDispatcher("/accueil.jsp").include(request, response);
                }catch (MonException m) {
                    // On passe l'erreur à  la page JSP
                    request.setAttribute("MesErreurs", m.getMessage());
                    request.getRequestDispatcher("PostMessage.jsp").forward(request, response);
                }catch (Exception e) {
                    // On passe l'erreur à la page JSP
                    System.out.println("Erreur client  :" + e.getMessage());
                    request.setAttribute("MesErreurs", e.getMessage());
                    request.getRequestDispatcher("PostMessage.jsp").forward(request, response);
                }
            //}
        }
        if (DECONNEXION.equals(actionName)) {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    /**
     * Permet de publier une demande d'inscription dans le topic
     * @param uneDemande : la demande d'inscription a publier
     * @return
     * @throws Exception
     */
    boolean envoi(InscriptionActivite uneDemande) throws Exception {

        boolean ok = true;
        TopicConnection connection;

        try {

            // On crée la connexion JMS , session, producteur et message;
			/*
			 * connection = connectionFactory.createConnection(
			 * System.getProperty("username", DEFAULT_USERNAME),
			 * System.getProperty("password", DEFAULT_PASSWORD));
			 */

            // Création Connection et Session JMS
            connection = cf.createTopicConnection();
            session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);

            // On crée le producteur utilisé pour envoyer un message
            producer = session.createPublisher(topic);
            // On lance la connection
            connection.start();
            ObjectMessage message = session.createObjectMessage();
            message.setObject(uneDemande);
            // On publie le message
            producer.publish(message);
            producer.close();
            session.close();
            connection.close();
        } catch (JMSException j) {
            new MonException(j.getMessage());
            ok=false;
        }catch (Exception e) {
            new MonException(e.getMessage());
            ok=false;
        }
        return ok;
    }
}
