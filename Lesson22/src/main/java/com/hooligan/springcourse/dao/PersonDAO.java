package com.hooligan.springcourse.dao;

import com.hooligan.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;
    private static int PEOPLE_COUNT = 1;

    {
        people = new ArrayList<>();
        people.add(new Person(PEOPLE_COUNT++, "Alex"));
        people.add(new Person(PEOPLE_COUNT++, "John"));
        people.add(new Person(PEOPLE_COUNT++, "Max"));
        people.add(new Person(PEOPLE_COUNT++, "Olga"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        person.setId(PEOPLE_COUNT++);
        people.add(person);
    }

    public void update(int id, Person updatePerson){
        Person person = show(id);
        person.setName(updatePerson.getName());
    }

    public void delete(int id){
        people.removeIf(person -> person.getId() == id);
    }

}
