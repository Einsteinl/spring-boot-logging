package com.cig.demo2.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
//todo 声明由SpringJUnit4ClassRunner创建的应用程序上下文应该是一个WebApplicationContext(相对于基本的非WebApplicationContext)
@WebAppConfiguration
public class PersonControllerTest {

    @Autowired
    private WebApplicationContext webContext;

    private MockMvc mockMvc;

    /**
     * 在测试方法之前执行。将 webApplicationContext注入webAppContextSetup()方法，然后调用build()产生了一个
     * MockMvc实例，该实例赋给了一个实例变量，供测试方法使用
     */
    @Before
    public void setupMockMVC(){
        mockMvc= MockMvcBuilders.webAppContextSetup(webContext).build();
    }

    /**
     * 有了MockMvc，就可以写测试方法了。向/persons发送一个GET请求，判断返回值。
     * @throws Exception
     */
    @Test
    public void getPersonList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/persons"))
                .andExpect(MockMvcResultMatchers.status().isOk());

    }
}