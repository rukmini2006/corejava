package com.tutorial.spring.dao_02._06RowMapper.employee.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.tutorial.spring.dao_02._06RowMapper.employee.model.Employee;

public class EmployeeRowMapper implements RowMapper {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
		employee.setFirst_name(rs.getString("FIRST_NAME"));
		employee.setJob_id(rs.getString("JOB_ID"));
		return employee;
	}

}
