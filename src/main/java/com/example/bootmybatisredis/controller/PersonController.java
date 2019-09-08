package com.example.bootmybatisredis.controller;

import com.example.bootmybatisredis.domain.Person;
import com.example.bootmybatisredis.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/person/{id}")
    public Person getPersonById(@PathVariable("id") Integer id) {
        return personService.selectPersonById(id);
    }

}
