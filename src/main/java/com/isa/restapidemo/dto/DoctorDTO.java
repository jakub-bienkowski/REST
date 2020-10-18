package com.isa.restapidemo.dto;

import com.isa.restapidemo.model.Patient;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class DoctorDTO {

    private int id;
    private String name;
    private String surname;
    private Integer pesel;
    private List<Patient> patientList;

    public DoctorDTO(int id, String name, String surname, Integer pesel, List<Patient> patientList) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.patientList = patientList;
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

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
}
