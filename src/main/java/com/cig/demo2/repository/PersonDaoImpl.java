package com.cig.demo2.repository;

import com.cig.demo2.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PersonDaoImpl implements PersonDao {
    @Override
    public List<Person> findAllList() {

        List<Person> persons=new ArrayList<>();
        for(int i=1;i<6;i++){
            persons.add(new Person(Integer.toString(i),"xiaoming"+i));
        }
        return persons;
    }
}
