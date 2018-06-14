package com.epul.dao;

import javax.persistence.*;

public abstract class EntityService {
    protected EntityManager entityManager;
    protected EntityManagerFactory emf;

    public EntityTransaction startTransaction() throws Exception {
        emf = Persistence.createEntityManagerFactory("cerisaiejpa");
        entityManager = emf.createEntityManager();

        return entityManager.getTransaction();
    }
}
