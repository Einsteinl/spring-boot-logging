package com.cig.demo2.repository;

import com.cig.demo2.entity.Person;

import java.util.List;

public interface PersonDao {

    public List<Person> findAllList();
}
