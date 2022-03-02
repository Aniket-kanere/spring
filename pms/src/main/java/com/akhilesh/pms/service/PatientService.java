package com.akhilesh.pms.service;

import com.akhilesh.pms.model.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatient();
    Patient getOnePatient(Integer id);
    Integer removePatientById(Integer id);
    Integer updatePatientById(Patient patient);
    Integer addPatient(Patient patient);

}
