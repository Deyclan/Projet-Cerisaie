package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class SportService {

    private EntityManagerFactory factory;
    private EntityManager entityManager;

    /*
    public List<SportEntity> getListSport() throws Exception {

        factory = Persistence.createEntityManagerFactory("PCerisaie");
        entityManager  = factory.createEntityManager();

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<SportEntity> query = builder.createQuery(SportEntity.class);
        Root<SportEntity> rootEntry = query.from(SportEntity.class);
        CriteriaQuery<SportEntity> all = query.select(rootEntry);
        TypedQuery<SportEntity> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }
    */

}
