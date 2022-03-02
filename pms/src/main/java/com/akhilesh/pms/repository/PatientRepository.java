package com.akhilesh.pms.repository;

import com.akhilesh.pms.model.Patient;

import java.util.List;

public interface PatientRepository {

    Patient getPatientById(Integer id);
    List<Patient> getPatients();
    Integer updatePatient(Patient patient);
    Integer deletePatientById(Integer id);
    Integer createPatient(Patient patient);
}
