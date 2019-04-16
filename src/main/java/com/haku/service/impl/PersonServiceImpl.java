package com.haku.service.impl;

import com.haku.dao.PersonDao;
import com.haku.entity.Person;
import com.haku.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> getPerson() {
        return personDao.getPerson();
    }
}
