package com.cig.demo2.controller;

import com.cig.demo2.entity.Person;
import com.cig.demo2.repository.PersonDao;
import com.google.gson.Gson;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PersonController {

    @Autowired
    PersonDao personDao;

    Logger logger= LoggerFactory.getLogger(PersonController.class);

    @Autowired
    Gson gson;
    @RequestMapping("/persons")
    public String getPersonList(){
        List<Person> personList=personDao.findAllList();
        logger.debug(gson.toJson(personList));
        return gson.toJson(personList);
    }
}
