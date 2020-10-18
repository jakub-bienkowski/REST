package com.isa.restapidemo.dao;

import com.isa.restapidemo.model.Doctor;
import com.isa.restapidemo.model.Patient;
import com.isa.restapidemo.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class DoctorDao implements Dao<Doctor>{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Optional<Doctor> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Doctor> getAll() {
        return null;
    }

    @Override
    public Person save(Doctor doctor) {
        return null;
    }

    @Override
    public void delete(Doctor doctor) {

    }

    @Override
    public Person update(Integer id, Doctor doctor) {
        return null;
    }


    public List<Patient> getByDoctorPesel(Integer doctorPesel){
        return null;
    }
}
