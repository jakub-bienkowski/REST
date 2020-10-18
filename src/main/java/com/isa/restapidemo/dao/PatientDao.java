package com.isa.restapidemo.dao;

import com.isa.restapidemo.model.Patient;
import com.isa.restapidemo.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

public class PatientDao implements Dao<Patient> {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Optional<Patient> get(Integer id) {
        return Optional.of(entityManager.find(Patient.class, id));
    }

    @Override
    public List<Patient> getAll() {
        Query all = entityManager.createQuery("FROM patient");
        return (List<Patient>) all.getResultList();
    }

    @Override
    public Person save(Patient patient) {
        return null;
    }

    @Override
    public void delete(Patient patient) {

    }

    @Override
    public Person update(Integer id, Patient patient) {
        return null;
    }


    public List<Patient> getByLastName(String l) {
        return null;
    }

    public List<Patient> getByPesel(Integer pesel){
        return null;
    }



}
