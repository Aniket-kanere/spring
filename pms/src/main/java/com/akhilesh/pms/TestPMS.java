package com.akhilesh.pms;

import com.akhilesh.pms.config.DbConfig;
import com.akhilesh.pms.model.Patient;
import com.akhilesh.pms.service.PatientService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestPMS {
    public static void main(String args[]){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DbConfig.class);
        PatientService patientService = annotationConfigApplicationContext.getBean(PatientService.class);


        System.out.println("Creating Patient ...");
        Patient patient = new Patient();
        patient.setId(3);
        patient.setFirstName("Akhilesh");
        patient.setLastName("Pandey");
        patient.setAge(21);

        patientService.addPatient(patient);


        System.out.println("Getting all the Patient");
        List<Patient> patientList = patientService.getAllPatient();
        for(Patient p : patientList){
            System.out.println(p);
        }

        System.out.println("Getting patient for id : "+ patient.getId());

        System.out.println(patientService.getOnePatient(patient.getId()));


        System.out.println("Deleting patient for Id 1");

        patientService.removePatientById(1);

    }
}
