package com.enterprises.administrate.dao;

import com.enterprises.administrate.models.Enterprises;

import java.util.Collection;

public interface EnterprisesDao {

    Enterprises create(Enterprises enterprises);

    Collection<Enterprises> list();
}
