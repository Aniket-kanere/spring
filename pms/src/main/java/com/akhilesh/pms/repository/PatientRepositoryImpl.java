package com.akhilesh.pms.repository;

import com.akhilesh.pms.model.Patient;
import com.akhilesh.pms.model.PatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class PatientRepositoryImpl implements PatientRepository{


    JdbcTemplate jdbcTemplate;

    private final String SELECT_QUERY = "Select * from Patient";
    private final String UPDATE_QUERY = "UPDATE Patient Set first_name = ? , last_name = ? , age = ? WHERE id = ?";
    private final String CREATE_QUERY = "INSERT INTO Patient Values(?,?,?,?)";
    private final String DELETE_QUERY = "DELETE FROM Patient WHERE id = ?";
    private final String SELECT_PATIENT_BY_ID = "Select * from Patient WHERE id = ?";


    @Autowired
    public PatientRepositoryImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }



    @Override
    public List<Patient> getPatients() {
       List<Patient> patientList = jdbcTemplate.query(SELECT_QUERY, new PatientMapper());
        return patientList;
    }

    @Override
    public Patient getPatientById(Integer id) {
       return   jdbcTemplate.queryForObject(SELECT_PATIENT_BY_ID, new PatientMapper(), id);
    }



    @Override
    public Integer updatePatient(Patient patient) {

      Integer count =  jdbcTemplate.update(UPDATE_QUERY, patient.getFirstName(),patient.getLastName(), patient.getAge(), patient.getId());
        return count;
    }

    @Override
    public Integer deletePatientById(Integer id) {
        return jdbcTemplate.update(DELETE_QUERY,id);
    }

    @Override
    public Integer createPatient(Patient patient) {
       Integer count = jdbcTemplate.update(CREATE_QUERY,patient.getId(),patient.getFirstName(),patient.getLastName(),patient.getAge());
        return count;
    }
}
