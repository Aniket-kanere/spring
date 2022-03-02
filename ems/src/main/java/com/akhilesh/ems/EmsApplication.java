package com.akhilesh.ems;

import com.akhilesh.ems.model.Employee;
import com.akhilesh.ems.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@Slf4j
@SpringBootApplication
public class EmsApplication {


    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(EmsApplication.class, args);
        System.out.println("Welcome to spring boot session...");


        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        List<Employee> employeeList = employeeService.getEmployees();


        for (Employee employee : employeeList) {
            log.info("Employee id : [{}] , name : [{}] , age : [{}] ", employee.getEmpId(), employee.getEmpName(), employee.getAge());
        }
    }

}
