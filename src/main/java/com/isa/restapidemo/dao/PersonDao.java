package com.isa.restapidemo.dao;

import com.isa.restapidemo.person.Person;

import javax.ejb.Stateless;
import javax.persistence.*;
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

    public List<Person> getAll() {
        Query all = entityManager.createQuery("FROM person");
        return (List<Person>) all.getResultList();
    }

    public List<Person> getByLastName(String lastNameSearch) {
        TypedQuery<Person> query = entityManager.createQuery(
                "SELECT p FROM person p WHERE p.lastName = '" + empNumber + "'", Employee.class);
        Employee employee = query.getSingleResult();
       return entityManager.createQuery("select u from person u where lastName like :" + lastNameSearch, Person.class).getResultList();
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
