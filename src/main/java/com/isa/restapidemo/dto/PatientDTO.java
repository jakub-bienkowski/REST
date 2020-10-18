package com.isa.restapidemo.dto;

import com.isa.restapidemo.model.Address;
import com.isa.restapidemo.model.Doctor;

import javax.persistence.*;

public class PatientDTO {

    private int id;
    private String name;
    private String surname;
    private Integer pesel;
    private Doctor doctor;
    private Address address;

    public PatientDTO(int id, String name, String surname, Integer pesel, Doctor doctor, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.doctor = doctor;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getPesel() {
        return pesel;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
