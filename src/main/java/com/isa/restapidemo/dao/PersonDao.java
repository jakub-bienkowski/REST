package com.isa.restapidemo.dao;

import com.isa.restapidemo.person.Person;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Stateless
public class PersonDao {

    @PersistenceContext
    EntityManager entityManager;

    public Optional<Person> get(Integer id) {
        return Optional.of(entityManager.find(Person.class, id));
    }

    @Transactional
    public List<Person> getAll() {
        Query all = entityManager.createQuery("FROM person");
        List<Person> result = all.getResultList();
        return result;
        //return entityManager.createQuery("FROM Person").getResultList();
            }

    public Person save(Person person) {
        entityManager.persist(person);
        return person;
    }

    public void delete(Person person) {
        entityManager.remove(entityManager.contains(person) ? person : entityManager.merge(person));
    }


    public Person update(Integer id, Person person) {

        Person personFound = entityManager.find(Person.class, id);
        personFound.setName(person.getName());
        personFound.setLastName(person.getLastName());
        personFound.setGender(person.getGender());
        return personFound;
    }
}
