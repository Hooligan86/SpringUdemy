package com.hooligan.springcourse.dao;


import com.hooligan.springcourse.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNTER = 1;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(PEOPLE_COUNTER++, "Tom", 24, "tom@mail.ru"));
        people.add(new Person(PEOPLE_COUNTER++, "John", 52, "john@mail.ru"));
        people.add(new Person(PEOPLE_COUNTER++, "Kate", 18, "kate@gmail.com"));
        people.add(new Person(PEOPLE_COUNTER++, "Natali", 34, "natali@yahoo.com"));
    }

    public List<Person> getAllPeople() {
        return people;
    }

    public Person getPersonById(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(PEOPLE_COUNTER++);
        people.add(person);
    }

    public void deleteById(int id) {
        people.removeIf(person -> person.getId() == id);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = getPersonById(id);
        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }


}
