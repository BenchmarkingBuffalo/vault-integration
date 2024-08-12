package com.examples.vaultintegration.dao;

import com.examples.vaultintegration.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee getEmployee(int id) {
        jdbcTemplate.queryForObject("select id, first_name, last_name from employee where id=" + id,
                new RowMapper<Object>() {
                    @Override
                    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Employee emp = new Employee();
                        emp.setId(rs.getInt("id"));
                        emp.setFirstName(rs.getString("first_name"));
                        emp.setLastName(rs.getString("last_name"));
                        return emp;
                    }

        });
        return null;
    }

    @Override
    public void saveEmployee(Employee employee) {
        String sql = "insert into employee(id, first_name, last_name) values(?, ?, ?)";
        System.out.println(sql+"" +employee.getFirstName()+" "+employee.getLastName());
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        int cnt = jdbcTemplate.update(sql, rand_int1, employee.getFirstName(), employee.getLastName());
        System.out.println("saved emp count: "+ cnt);
    }
}
