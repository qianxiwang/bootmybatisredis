package com.example.bootmybatisredis.service;

import com.example.bootmybatisredis.domain.Person;

public interface PersonService {

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public Person selectPersonById(Integer id);

    /**
     * 插入数据
     *
     * @param person
     * @return
     */
    public int insertPerson(Person person);

    /**
     * 更新数据
     *
     * @param person
     * @return
     */
    public int updatePerson(Person person);

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    public int deletePerson(Integer id);

}
