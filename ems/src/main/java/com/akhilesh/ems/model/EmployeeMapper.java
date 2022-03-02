package com.akhilesh.ems.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    /**
     * Implementations must implement this method to map each row of data
     * in the ResultSet. This method should not call {@code next()} on
     * the ResultSet; it is only supposed to map values of the current row.
     *
     * @param resultSet     the ResultSet to map (pre-initialized for the current row)
     * @param rowNum the number of the current row
     * @return the result object for the current row (may be {@code null})
     * @throws SQLException if an SQLException is encountered getting
     *                      column values (that is, there's no need to catch SQLException)
     */
    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {

        Employee employee = new Employee();
        employee.setEmpId(resultSet.getInt(1));
        employee.setEmpName(resultSet.getString(2));
        employee.setAge(resultSet.getInt(3));

        return employee;
    }
}
