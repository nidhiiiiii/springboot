package com.nidhi.springboot.dao;

import com.nidhi.springboot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
import java.util.ArrayList;
@Repository("fakeDao")

public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> DB= new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }
    @Override
    public List<Person>selectAllPeople(){
        return DB;
    }
}
