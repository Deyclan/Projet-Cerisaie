package services;

import model.ActiviteEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

public class ReserverActivieService {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public  void insertionInscription(ActiviteEntity activite) throws Exception {

        // On instancie l'entity Manager
        factory = Persistence.createEntityManagerFactory("PCerisaie");
        entityManager  = factory.createEntityManager();

        try {

            if (!entityManager.contains(activite))
            {
                // On démarre une transaction
                entityManager.getTransaction().begin();
                entityManager.persist(activite);
                entityManager.flush();
                // on valide la transacition
                entityManager.getTransaction().commit();
            }
            entityManager.close();

        } catch (EntityNotFoundException h) {
            h.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}