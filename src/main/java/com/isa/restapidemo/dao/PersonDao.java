package com.isa.restapidemo.dao;

import com.isa.restapidemo.person.Person;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Stateless
public class PersonDao implements Dao<Person> {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Optional<Person> get(Integer id) {
        return Optional.of(entityManager.find(Person.class, id));
    }

    @Override
    public List<Person> getAll() {
        Query all = entityManager.createQuery("FROM person");
        return (List<Person>) all.getResultList();
    }


    public List<Person> getByLastName(String lastNameSearch) {
        TypedQuery<Person> query = entityManager.createQuery(
                "SELECT p FROM person p WHERE p.lastName like :lastName", Person.class);
        List<Person> list = query.setParameter("lastName", "%" + lastNameSearch + "%").getResultList();
        return list;
    }

    @Override
    public Person save(Person person) {
        entityManager.persist(person);
        return person;
    }

    @Override
    public void delete(Person person) {
        entityManager.remove(entityManager.contains(person) ? person : entityManager.merge(person));
    }


    @Override
    public Person update(Integer id, Person person) {

        Person personFound = entityManager.find(Person.class, id);
        personFound.setName(person.getName());
        personFound.setLastName(person.getLastName());
        personFound.setGender(person.getGender());
        return personFound;
    }
}
