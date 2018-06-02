package services;

import model.ClientEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientService {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public void insertClient(ClientEntity client) throws Exception {

        entityManagerFactory = Persistence.createEntityManagerFactory("PCerisaie");
        entityManager = entityManagerFactory.createEntityManager();

        try {
            if(!entityManager.contains(client)){
                entityManager.getTransaction().begin();
                entityManager.persist(client);
                entityManager.flush();
                entityManager.getTransaction().commit();
            }

            entityManager.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
