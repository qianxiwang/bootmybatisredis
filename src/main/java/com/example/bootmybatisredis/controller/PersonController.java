package com.example.bootmybatisredis.controller;

import com.example.bootmybatisredis.Utils.Result;
import com.example.bootmybatisredis.Utils.ResultCode;
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

//    @GetMapping("/person/{id}")
//    public Person getPersonById(@PathVariable("id") Integer id) {
//        Person person = personService.selectPersonById(id);
//        return person;
//    }


    @GetMapping("/person/{id}")
    public Result getPersonById(@PathVariable("id") Integer id) {
        Person person = new Person();

        if (id.equals(0)) {
            return Result.failure(ResultCode.FAILURE);
        } else if (id.equals(3)) {
            return Result.failure(ResultCode.FAILURE);
        } else {
            person = personService.selectPersonById(id);
            return Result.success(person);
        }

    }
}