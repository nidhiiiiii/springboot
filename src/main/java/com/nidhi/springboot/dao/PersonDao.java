package com.nidhi.springboot.dao;

import com.nidhi.springboot.model.Person;

import java.util.UUID;
import java.util.List;

public interface PersonDao {
    //methods
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id=UUID.randomUUID();
        return insertPerson(id,person);
    }

    List<Person>selectAllPeople();
}
