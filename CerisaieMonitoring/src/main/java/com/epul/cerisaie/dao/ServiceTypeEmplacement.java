package com.epul.cerisaie.dao;

import com.epul.cerisaie.model.TypeEmplacementEntity;

import javax.persistence.EntityTransaction;
import java.util.List;

public class ServiceTypeEmplacement extends EntityService {

    public List<TypeEmplacementEntity> getListTypeEmplacement() {
        List<TypeEmplacementEntity> typeEmplacementEntityList = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            typeEmplacementEntityList = (List<TypeEmplacementEntity>) entityManager.createQuery("select t from TypeEmplacementEntity t order by t.codeTypeE").getResultList();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeEmplacementEntityList;
    }

    public TypeEmplacementEntity getTypeEmplacementByCodeTypeE(int codeTypeE) {
        TypeEmplacementEntity TypeEmplacement = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            TypeEmplacement = entityManager.find(TypeEmplacementEntity.class, codeTypeE);
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return TypeEmplacement;
    }
}
