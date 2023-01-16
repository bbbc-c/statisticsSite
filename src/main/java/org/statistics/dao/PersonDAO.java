package org.statistics.dao;

import org.springframework.stereotype.Component;
import org.statistics.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(1,"Efim"));
        people.add(new Person(2,"Dima"));
        people.add(new Person(3,"Maks"));
    }

    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        for (Person p : people)
            if (p.getId() == id)
                return p;
        return null;
    }
}
