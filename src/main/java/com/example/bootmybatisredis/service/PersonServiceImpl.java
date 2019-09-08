package com.example.bootmybatisredis.service;

import com.example.bootmybatisredis.domain.Person;
import com.example.bootmybatisredis.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service("PersonService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    @Cacheable(value = "person", key = "#id")
    public Person selectPersonById(Integer id) {
        return personMapper.selectPersonById(id);
    }

    @Override
    public int insertPerson(Person person) {
        return 0;
    }

    @Override
    public int updatePerson(Person person) {
        return 0;
    }

    @Override
    public int deletePerson(Integer id) {
        return 0;
    }
}
