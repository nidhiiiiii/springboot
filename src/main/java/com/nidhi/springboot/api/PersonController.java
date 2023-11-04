package com.nidhi.springboot.api;

import com.nidhi.springboot.model.Person;
import com.nidhi.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService){
        this.personService=personService;
    }
    @PostMapping //to say that this method is for posting
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }
    @GetMapping //
    public List<Person>getAllPeople(){
        return personService.getAllPeople();
    }
}
