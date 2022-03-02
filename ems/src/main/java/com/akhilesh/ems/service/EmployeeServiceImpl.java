package com.akhilesh.ems.service;

import com.akhilesh.ems.model.Employee;
import com.akhilesh.ems.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl implements  EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployees() {
        log.info("Inside getEmployees(-) method of EmployeeServiceImpl class");
        return employeeRepository.getAllEmployee();
    }

    @Override
    public Employee getOneEmployee(Integer empId) {
        return null;
    }

    @Override
    public Integer deleteEmployee(Integer empId) {
        return null;
    }

    @Override
    public Integer updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Integer createEmployee(Employee employee) {
        return null;
    }
}
