package com.haku;

import com.haku.entity.Person;
import com.haku.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private PersonService personService;

    @Test
    public void contextLoads() {
        List<Person> person = personService.getPerson();
        System.out.println(person);
        // origin v
        // dev v
    }

}

