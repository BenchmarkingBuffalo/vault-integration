package com.examples.vaultintegration.controller;

import com.examples.vaultintegration.dao.EmployeeRepository;
import com.examples.vaultintegration.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    //@Autowired
    //DataSourceConfig dataSourceConfig;

    @GetMapping
    public ResponseEntity<Employee> getEmployee() {
        Employee employee = employeeRepository.getEmployee(1);
        return new ResponseEntity(employee, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveEmployee(@RequestBody Employee emp) {
        //System.out.println("dbconfig.user: " + dataSourceConfig.getUsername() +" "+ dataSourceConfig.getPassword());
        employeeRepository.saveEmployee(emp);
        System.out.println("employee saved");
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
