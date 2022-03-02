package com.akhilesh.pms.service;

import com.akhilesh.pms.model.Patient;
import com.akhilesh.pms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{


    @Autowired
    PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.getPatients();
    }

    @Override
    public Patient getOnePatient(Integer id) {
        return patientRepository.getPatientById(id);
    }

    @Override
    public Integer removePatientById(Integer id) {
        return patientRepository.deletePatientById(id);
    }

    @Override
    public Integer updatePatientById(Patient patient) {
        return patientRepository.updatePatient(patient);
    }

    @Override
    public Integer addPatient(Patient patient) {
        return patientRepository.createPatient(patient);
    }
}
