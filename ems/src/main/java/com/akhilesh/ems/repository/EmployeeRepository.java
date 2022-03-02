package com.akhilesh.ems.repository;

import com.akhilesh.ems.model.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> getAllEmployee();
    Employee getEmployeeById(Integer empId);
    Integer createEmployee(Employee employee);
    Integer updateEmployee(Employee employee);
    Integer deleteEmployee(Employee employee);

}
