package com.isa.restapidemo.service;

import com.isa.restapidemo.dao.Dao;
import com.isa.restapidemo.dto.DtoBuilder;
import com.isa.restapidemo.dto.PersonDTO;
import com.isa.restapidemo.person.Person;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestScoped
public class PersonService {

    @Inject
    Dao<Person> personDao;

    public PersonDTO save (PersonDTO personDTO){

        Person person = DtoBuilder.fromDTO(personDTO);
        Person personSaved = personDao.save(person);
        Optional<PersonDTO> savedPersonDTO = DtoBuilder.toDTO(Optional.ofNullable(personSaved));
        return savedPersonDTO.orElse(null);
    }

    public PersonDTO getById(Integer id){
        Optional<Person> person = personDao.get(id);
        return DtoBuilder.toDTO(person).orElse(null);
    }

    public List<PersonDTO> getAll (){
        return personDao.getAll().stream().map(person -> new PersonDTO(person.getId(),person.getName(),person.getLastName(),person.getGender())).collect(Collectors.toList());
    }

    public List<PersonDTO> findByLastName(String lastNameSearch) {
        return personDao.getByLastName(lastNameSearch).stream().map(person -> new PersonDTO(person.getId(), person.getName(), person.getLastName(), person.getGender())).collect(Collectors.toList());
    }

    public boolean delete (Integer id){
        Optional<Person> person = personDao.get(id);
        if (person.isPresent()) {
            personDao.delete(person.get());
            return true;
        }
        return false;
    }

    public PersonDTO update (Integer id, PersonDTO personDTO){
        Person person = personDao.update(id, DtoBuilder.fromDTO(personDTO));
        return DtoBuilder.toDTO(Optional.ofNullable(person)).orElse(null);
    }
}
