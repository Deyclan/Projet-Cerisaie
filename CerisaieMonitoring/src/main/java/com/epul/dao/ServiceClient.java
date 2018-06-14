package com.epul.dao;

import com.epul.metier.ActiviteEntity;
import com.epul.metier.ClientEntity;
import com.mysql.fabric.xmlrpc.Client;

import javax.persistence.EntityTransaction;
import java.util.List;

public class ServiceClient extends EntityService {

    public List<ClientEntity> getListClient() {
        List<ClientEntity> clientEntityList = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            clientEntityList = (List<ClientEntity>) entityManager.createQuery("select c from ClientEntity c order by c.numeroClient").getResultList();
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientEntityList;
    }

    public ClientEntity getClientByNumClient(int numClient) {
        ClientEntity client = null;
        try {
            EntityTransaction transaction = startTransaction();
            transaction.begin();
            client = entityManager.find(ClientEntity.class, numClient);
            entityManager.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }


}
