package com.enterprises.administrate.dao;

import com.enterprises.administrate.models.Enterprises;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
@Transactional
public class EnterprisesDaoImp implements EnterprisesDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Enterprises create(Enterprises enterprises) {

        entityManager.merge(enterprises);
        entityManager.flush();
        return enterprises;
    }

    @Override
    public Enterprises update(Enterprises enterprises) {
        Enterprises enterprisesEdit = entityManager.find(Enterprises.class, enterprises.getId());
        enterprisesEdit.setName(enterprises.getName());
        entityManager.merge(enterprisesEdit);
        entityManager.flush();
        return enterprises;
    }

    @Override
    public Collection<Enterprises> list() {
        String query = "FROM Enterprises";
        return entityManager.createQuery(query).getResultList();
    }
}
