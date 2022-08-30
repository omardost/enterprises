package com.enterprises.administrate.controllers;

import com.enterprises.administrate.dao.EmployeesDao;
import com.enterprises.administrate.models.Departments;
import com.enterprises.administrate.models.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/employees")
public class EmployeesComtroller {

    @Autowired
    EmployeesDao employeesDao;

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Employees employees){
        this.employeesDao.create(employees);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
