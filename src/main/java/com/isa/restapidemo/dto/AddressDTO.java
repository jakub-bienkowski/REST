package com.isa.restapidemo.dto;

import com.isa.restapidemo.model.Patient;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

public class AddressDTO {

    private int id;
    private String district;
    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;
    private int localNumber;

    private List<Patient> locators;

    public AddressDTO(int id, String district, String city, String postalCode, String street, String houseNumber, int localNumber, List<Patient> locators) {
        this.id = id;
        this.district = district;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber = houseNumber;
        this.localNumber = localNumber;
        this.locators = locators;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    public void setLocalNumber(int localNumber) {
        this.localNumber = localNumber;
    }

    public List<Patient> getLocators() {
        return locators;
    }

    public void setLocators(List<Patient> locators) {
        this.locators = locators;
    }

}
