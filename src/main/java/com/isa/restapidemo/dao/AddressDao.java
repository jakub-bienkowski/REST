package com.isa.restapidemo.dao;

import com.isa.restapidemo.model.Address;
import com.isa.restapidemo.model.Patient;
import com.isa.restapidemo.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

public class AddressDao implements Dao<Address>{
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Optional<Address> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Address> getAll() {
        return null;
    }

    @Override
    public Person save(Address address) {
        return null;
    }

    @Override
    public void delete(Address address) {

    }

    @Override
    public Person update(Integer id, Address address) {
        return null;
    }

    public List<Patient> getByDistrict(String district){
        return null;
    }

    public List<Patient> getByCity(String city){
        return null;
    }

    public List<Patient> getByPostalCode(String postalCode){
        return null;
    }
}
