package com.springboot.demo02;

import com.springboot.demo02.bean.Person;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo02ApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext io;
    @Test
    public void HelloService(){
       boolean b=io.containsBean("helloService02");
        System.out.println(b);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
