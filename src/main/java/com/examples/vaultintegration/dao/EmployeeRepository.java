package com.examples.vaultintegration.dao;

import com.examples.vaultintegration.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    Employee getEmployee(int id);
    void saveEmployee(Employee employee);
}
