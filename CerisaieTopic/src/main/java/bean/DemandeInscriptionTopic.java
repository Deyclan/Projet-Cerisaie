package bean;

import model.Activite;
import model.ActiviteEntity;
import services.ReserverActivieService;
import services.SejourService;
import services.SportService;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Message-Driven Bean implementation class for: DemandeInscriptionTopic
 */
// On se connecte à la file d'attente InscriptionTopic
@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:jboss/exported/topic/DemandeInscriptionJmsTopic"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")}, mappedName = "DemandeInscriptionJmsTopic")
public class DemandeInscriptionTopic implements MessageListener {

    @Resource
    private MessageDrivenContext context;

    /*
     * Default constructor.
     */
    public DemandeInscriptionTopic() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @see MessageListener#onMessage(Message)
     */
    public void onMessage(Message message) {
        boolean ok = false;
        // On gère le message récupéré dans le topic
        try {
            // On transforme le message en demande d'inscription
            if (message != null) {
                ObjectMessage objectMessage = (ObjectMessage) message;
                Activite activite = (Activite) objectMessage.getObject();
                message = null;

                try {
                    ActiviteEntity activiteEntity = new ActiviteEntity();
                    SejourService sejourService = new SejourService();
                    SportService sportService = new SportService();

                    // on tansfère les données reçues dans l'objet Entity
                    activiteEntity.setCodeSport(activite.getCodeSport());
                    activiteEntity.setDateJour(activite.getDateJour());
                    activiteEntity.setNbLoc((short)activite.getNbLoc());
                    activiteEntity.setNumSej(activite.getNumSej());
                    activiteEntity.setSejourByNumSej(sejourService.getSejourByNumSejour(activite.getNumSej()));
                    activiteEntity.setSportByCodeSport(sportService.getSportByCodeSport(activite.getCodeSport()));

                    ReserverActivieService reserverActivieService = new ReserverActivieService();
                    reserverActivieService.insertionInscription(activiteEntity);

                } catch (Exception ex) {
                    EcritureErreur(ex.getMessage());
                }
            }

        } catch (JMSException jmse) {
            System.out.println(jmse.getMessage());
            EcritureErreur(jmse.getMessage());
            context.setRollbackOnly();
        }
    }

    /**
     * Permet d'enregistrer une erreur dans un fichier log
     *
     * @param message Le message d'erreur
     */
    public void EcritureErreur(String message) {
        BufferedWriter wr;
        String nomf = "erreurs.log";
        Date madate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm");
        try {
            // On écrit à la fin du fichier
            wr = new BufferedWriter(new FileWriter(nomf, true));
            wr.newLine();
            wr.write(sdf.format(madate));
            wr.newLine();
            wr.write(message);
            wr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
