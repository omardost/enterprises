package com.enterprises.administrate.controllers;

import com.enterprises.administrate.dao.DepartmentsDao;
import com.enterprises.administrate.models.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/departments")
public class DepartmentsController {

    @Autowired
    DepartmentsDao departmentsDao;

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Departments departments){
        this.departmentsDao.create(departments);
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }
}
