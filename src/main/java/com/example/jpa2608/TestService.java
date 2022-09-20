package com.example.jpa2608;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class TestService {

    @Autowired
    EntityManager em;

    @Autowired
    SampleEntityRepository repository;

    @Transactional
    public void doSomething() {
        repository.findAll();
    }
}
