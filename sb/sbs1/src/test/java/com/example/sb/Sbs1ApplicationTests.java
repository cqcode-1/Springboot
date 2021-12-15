package com.example.sb;

import com.example.sb.entity.Person;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbs1ApplicationTests {

    @Autowired
    Person mPerson;

    @Test
    void contextLoads() {
        System.out.println(mPerson);
    }

}
