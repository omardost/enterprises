package com.enterprises.administrate.controllers;

import com.enterprises.administrate.dao.EnterprisesDao;
import com.enterprises.administrate.models.Enterprises;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController()
@RequestMapping("/api/enterprises")
public class EnterprisesController {

    @Autowired
    EnterprisesDao enterprisesDao;

    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ResponseEntity<Object> create(@RequestBody Enterprises enterprises){
        this.enterprisesDao.create(enterprises);
        return new ResponseEntity<>(enterprises, HttpStatus.OK);
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ResponseEntity<Object> list(){
        Collection<Enterprises> colEnterprises = this.enterprisesDao.list();
        return new ResponseEntity<>(colEnterprises, HttpStatus.OK);
    }

    @RequestMapping(value="/update", method = RequestMethod.POST)
    public ResponseEntity<Object> update(@RequestBody Enterprises enterprises){
        this.enterprisesDao.update(enterprises);
        return new ResponseEntity<>(enterprises, HttpStatus.OK);
    }
}
