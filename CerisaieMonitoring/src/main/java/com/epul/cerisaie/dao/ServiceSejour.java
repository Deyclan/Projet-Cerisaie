package com.epul.cerisaie.dao;

import com.epul.cerisaie.model.SejourEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class ServiceSejour extends EntityService {

    public List<SejourEntity> getListSejour() {
        List<SejourEntity> sejourEntityList = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            sejourEntityList = (List<SejourEntity>) entityManager.createQuery("select s from SejourEntity s order by s.numSej").getResultList();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sejourEntityList;
    }

    public SejourEntity getSejourByNumSejour(int numSejour) {
        SejourEntity sejour = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            sejour = entityManager.find(SejourEntity.class, numSejour);
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sejour;
    }
}
