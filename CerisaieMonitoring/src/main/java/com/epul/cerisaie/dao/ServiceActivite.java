package com.epul.cerisaie.dao;

import com.epul.cerisaie.model.ActiviteEntity;

import javax.persistence.EntityTransaction;
import java.util.Date;
import java.util.List;

public class ServiceActivite extends EntityService {

    public List<ActiviteEntity> getListActivite(){
        List<ActiviteEntity> activiteEntityList = null;
        try{
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            activiteEntityList = (List<ActiviteEntity>) entityManager.createQuery("select a from ActiviteEntity a order by a.codeSport").getResultList();
            entityManager.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return activiteEntityList;
    }

    public ActiviteEntity getActiviteByCodeSport(int codeSport) {
        ActiviteEntity activite = null;
        List<ActiviteEntity> activiteEntityList;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            activiteEntityList = entityManager.createQuery("select a from ActiviteEntity a where a.codeSport =" + codeSport).getResultList();
            if (activiteEntityList.size() > 0) {
                activite = activiteEntityList.get(0);
            }
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return activite;
    }

    public ActiviteEntity getActiviteByDate(Date date) {
        ActiviteEntity activite = null;
        List<ActiviteEntity> activiteEntityList;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            activiteEntityList = entityManager.createQuery("select a from ActiviteEntity a where a.dateJour =" + date).getResultList();
            if (activiteEntityList.size() > 0) {
                activite = activiteEntityList.get(0);
            }
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return activite;
    }

    public ActiviteEntity getActiviteByNumeroSejour(int numSejour) {
        ActiviteEntity activite = null;
        List<ActiviteEntity> activiteEntityList;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            activiteEntityList = entityManager.createQuery("select a from ActiviteEntity a where a.numSej =" + numSejour).getResultList();
            if (activiteEntityList.size() > 0) {
                activite = activiteEntityList.get(0);
            }
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return activite;
    }

    public void updateActivite(ActiviteEntity activite) {
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            entityManager.merge(activite);
            transaction.commit();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
