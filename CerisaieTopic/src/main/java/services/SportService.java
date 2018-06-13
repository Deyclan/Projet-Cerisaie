package services;

import model.SejourEntity;
import model.SportEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SportService {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public SportEntity getSportByCodeSport(int codeSport) throws Exception {
        factory = Persistence.createEntityManagerFactory("PCerisaie");
        entityManager  = factory.createEntityManager();
        return entityManager.find(SportEntity.class, codeSport);
    }
}
