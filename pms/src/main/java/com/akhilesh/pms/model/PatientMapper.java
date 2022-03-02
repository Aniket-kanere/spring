package com.akhilesh.pms.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientMapper implements RowMapper<Patient> {
    @Override
    public Patient mapRow(ResultSet resultSet, int rowNum) throws SQLException {
       Patient patient = new Patient();
       patient.setId(resultSet.getInt(1));
       patient.setFirstName(resultSet.getString(2));
       patient.setLastName(resultSet.getString(3));
       patient.setAge(resultSet.getInt(4));
       return patient;
    }
}
