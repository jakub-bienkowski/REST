package com.isa.restapidemo.service;

import com.isa.restapidemo.dao.Dao;
import com.isa.restapidemo.dto.PatientDTO;
import com.isa.restapidemo.model.Patient;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@RequestScoped
public class PatientService {

    @Inject
    Dao<Patient> patientDao;

    public List<PatientDTO> getAll(){
        return null;
    }

}
