package com.tutorial.spring.dao_02._06RowMapper.employee.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.tutorial.spring.dao_02._06RowMapper.employee.mapper.EmployeeRowMapper;
import com.tutorial.spring.dao_02._06RowMapper.employee.model.Employee;

public class JdbcEmployeeDAO extends JdbcDaoSupport implements EmployeeDAO{

	

	public void insert(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employees "+"(EMPLOYEE_ID,FIRST_NAME,JOB_ID) values (?,?,?)";
		getJdbcTemplate().update(sql, new Object[]{employee.getEmployee_id(),employee.getFirst_name(),employee.getJob_id()});
		
		
	}

	public void insertNamedParameter(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void insertBatch(final List<Employee> employees) {
		String sql = "insert into EMPLOYEE_BK "+ "(empid,fname,jobid) values (?,?,?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Employee employee =employees.get(i);
				ps.setLong(1, employee.getEmployee_id());
				ps.setString(2, employee.getFirst_name());
				ps.setString(3, employee.getJob_id());
				
			}
			
			public int getBatchSize() {
				// TODO Auto-generated method stub
				return employees.size();
			}
		});
		
	}
	public void insertBatchSQL(String sql) {
		getJdbcTemplate().batchUpdate(new String[]{sql});
		
	}

	

	
	
	 //query single row with RowMapper
	public Employee findByEmployeeId(int empid) {
		 String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";

	        Employee employee = (Employee) getJdbcTemplate().queryForObject(
	                sql, new Object[]{empid}, new EmployeeRowMapper());
	        return employee;
	    }

	public Employee findByEmployeeId2(int empid) {
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
        Employee employee = (Employee) getJdbcTemplate().queryForObject(
                sql, new Object[]{empid},
                new BeanPropertyRowMapper(Employee.class));
        return employee;
	}

	 //query mutiple rows with manual mapping
    public List<Employee> findAll() {

        String sql = "SELECT * FROM EMPLOYEES";

        List<Employee> employees = new ArrayList<Employee>();

        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        System.out.println("JdbcEmployeeDAO.findAll()" + rows.size());
        for (Map row : rows) {
            Employee employee = new Employee();
            employee.setEmployee_id(Integer.valueOf((java.math.BigDecimal) (row.get("EMPLOYEE_ID")) + ""));
            employee.setFirst_name((String) row.get("FIRST_NAME"));
            employee.setJob_id((String) row.get("JOB_ID"));
            employees.add(employee);
        }
        return employees;
    }

    //query mutiple rows with BeanPropertyRowMapper (Employee.class)
    public List<Employee> findAll2() {
        String sql = "SELECT * FROM EMPLOYEES";
        List<Employee> employees = getJdbcTemplate().query(sql,
                new BeanPropertyRowMapper(Employee.class));
        return employees;
    }

    public String findEmployeeNameById(int empid) {
        String sql = "SELECT FIRST_NAME FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
        String name = (String) getJdbcTemplate().queryForObject(
                sql, new Object[]{empid}, String.class);
        return name;
    }

    public int findTotalEmployee() {
        String sql = "SELECT COUNT(*) FROM EMPLOYEES";
        int total = getJdbcTemplate().queryForInt(sql);
        return total;
    }

	public void insertBatchNamedParameter(List<Employee> employee) {
		// TODO Auto-generated method stub
		
	}

	public void insertBatchNamedParameter2(List<Employee> employee) {
		// TODO Auto-generated method stub
		
	}

   
}
