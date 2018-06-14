package com.epul.cerisaie.dao;

import com.epul.cerisaie.model.SportEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class ServiceSport extends EntityService {

    public List<SportEntity> getListSport() {
        List<SportEntity> sportEntityList = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            sportEntityList = (List<SportEntity>) entityManager.createQuery("select s from SportEntity s order by s.codeSport").getResultList();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sportEntityList;
    }

    public SportEntity getSportByCodeSport(int codeSport) {
        SportEntity sport = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            sport = entityManager.find(SportEntity.class, codeSport);
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sport;
    }
}
