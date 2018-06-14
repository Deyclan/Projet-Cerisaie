package com.epul.dao;

import com.epul.metier.ClientEntity;
import com.epul.metier.EmplacementEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class ServiceEmplacement extends EntityService{

    public List<EmplacementEntity> getListEmplacement() {
        List<EmplacementEntity> emplacementEntityList = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            emplacementEntityList = (List<EmplacementEntity>) entityManager.createQuery("select e from EmplacementEntity e order by e.numEmplacement").getResultList();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emplacementEntityList;
    }

    public EmplacementEntity getEmplacementByNumEmplacement(int numEmplacement) {
        EmplacementEntity emplacement = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            emplacement = entityManager.find(EmplacementEntity.class, numEmplacement);
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emplacement;
    }

}
