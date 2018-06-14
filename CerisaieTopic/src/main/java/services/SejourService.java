package services;

import model.SejourEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SejourService {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public SejourEntity getSejourByNumSejour(int numSejour) throws Exception {
        factory = Persistence.createEntityManagerFactory("PCerisaie");
        entityManager  = factory.createEntityManager();
        return entityManager.find(SejourEntity.class, numSejour);
    }

}
