package com.isa.restapidemo.person;

import javax.persistence.*;
import java.util.Objects;

@Entity(name="person")
@Table
public class Person {

    @GeneratedValue
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private Gender gender;

    public Person (){

    }
    public Person(Integer id, String name, String lastName, Gender gender) {
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
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getId(), person.getId()) &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                getGender() == person.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastName(), getGender());
    }
}
