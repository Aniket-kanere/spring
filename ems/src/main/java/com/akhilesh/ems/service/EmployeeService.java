package com.akhilesh.ems.service;

import com.akhilesh.ems.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();
    Employee getOneEmployee(Integer empId);
    Integer deleteEmployee(Integer empId);
    Integer updateEmployee(Employee employee);
    Integer createEmployee(Employee employee);

}
