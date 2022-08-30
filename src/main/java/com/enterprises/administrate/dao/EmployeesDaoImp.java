package com.enterprises.administrate.dao;

import com.enterprises.administrate.models.Employees;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class EmployeesDaoImp implements EmployeesDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Employees create(Employees employees) {
        entityManager.merge(employees);
        entityManager.flush();
        return employees;
    }
}
