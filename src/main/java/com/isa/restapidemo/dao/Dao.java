package com.isa.restapidemo.dao;

import com.isa.restapidemo.person.Person;

import javax.ejb.Local;
import java.util.List;
import java.util.Optional;

@Local
public interface Dao <T> {

    Optional<T> get(Integer id);

    List<T> getAll();

    Person save(T t);

    void delete(T t);

    Person update (Integer id, T t);

}
