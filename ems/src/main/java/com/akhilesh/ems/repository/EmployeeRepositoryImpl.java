package com.akhilesh.ems.repository;

import com.akhilesh.ems.model.Employee;
import com.akhilesh.ems.model.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Slf4j
@Repository
public class EmployeeRepositoryImpl implements  EmployeeRepository{

    private final String GET_ALL_EMPLOYEE = "SELECT * From Employee";

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public List<Employee> getAllEmployee() {
        log.info("Executing query in the database .. ");
        return jdbcTemplate.query(GET_ALL_EMPLOYEE, new EmployeeMapper());
    }

    @Override
    public Employee getEmployeeById(Integer empId) {
        return null;
    }

    @Override
    public Integer createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Integer deleteEmployee(Employee employee) {
        return null;
    }
}
