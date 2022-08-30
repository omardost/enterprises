package com.enterprises.administrate.dao;

import com.enterprises.administrate.models.Departments;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class DepartmentsDaoImp implements DepartmentsDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Departments create(Departments departments) {

        entityManager.merge(departments);
        entityManager.flush();
        return departments;
    }
}
