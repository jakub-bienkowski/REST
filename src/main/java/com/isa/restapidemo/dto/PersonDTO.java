package com.isa.restapidemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.isa.restapidemo.person.Gender;

import java.util.Objects;


public class PersonDTO {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer id;
    private String name;
    private String lastName;
    private Gender gender;

    public PersonDTO() {

    }

    public PersonDTO(Integer id, String name, String lastName, Gender gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonDTO)) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(getId(), personDTO.getId()) &&
                Objects.equals(getName(), personDTO.getName()) &&
                Objects.equals(getLastName(), personDTO.getLastName()) &&
                getGender() == personDTO.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastName(), getGender());
    }
}
