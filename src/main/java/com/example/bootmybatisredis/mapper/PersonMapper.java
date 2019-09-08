package com.example.bootmybatisredis.mapper;

import com.example.bootmybatisredis.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonMapper {

    public Person selectPersonById(Integer id);

    public int insertPerson(Person person);

    public int updatePerson(Person person);

    public int deletePerson(Integer id);

}
