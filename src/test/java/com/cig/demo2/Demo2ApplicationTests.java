package com.cig.demo2;

import com.cig.demo2.entity.Person;
import com.cig.demo2.repository.PersonDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

    @Autowired
    PersonDao personDao;

    Logger logger= LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        List<Person> persons=personDao.findAllList();
        assertEquals(5,persons.size());
    }

    @Test
    public void logtest1(){
        logger.trace("这是trace日志.......");
        logger.debug("这是debug日志.......");
        logger.info("这是info日志..........");
        logger.warn("这是warn日志 .........");
        logger.error("这是error日志.........");

    }

}

