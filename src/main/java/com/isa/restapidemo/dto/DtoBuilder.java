package com.isa.restapidemo.dto;

import com.isa.restapidemo.person.Person;

import java.util.Optional;

public class DtoBuilder {

    public static Optional<PersonDTO> toDTO (Optional<Person> personOption){

        return personOption.map(person -> {
            PersonDTO personDTO = new PersonDTO();
            personDTO.setId(person.getId());
            personDTO.setName(person.getName());
            personDTO.setLastName(person.getLastName());
            personDTO.setGender(person.getGender());

            return personDTO;
        });

    }

    public static Person fromDTO (PersonDTO personDTO){

        Person person = new Person();
        person.setId(personDTO.getId());
        person.setName(personDTO.getName());
        person.setLastName(personDTO.getLastName());
        person.setGender(personDTO.getGender());

        return person;
    }
}
