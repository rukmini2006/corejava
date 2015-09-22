package com.tutorial.spring.dao_02._05procedure;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.object.StoredProcedure;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("hr");
		
		 Employee emp = (Employee)
	                getEmployeeDetailsWithStoredProcedure(ds, "Neena");
	        System.out.println("Allen Details : " + emp);
		

	}
	private static Object getEmployeeDetailsWithStoredProcedure(DataSource ds,String ename){
		MyStoredProcedure sp = new MyStoredProcedure(ds);
		 //call procedure
        Map results = sp.myexecute(ename);
        //set outparmeter values to emp object
        Employee emp = new Employee();
        emp.setName(ename);
        emp.setNo((Integer) results.get("NO"));
        emp.setDesignation((String) results.get("DESG"));
        emp.setSalary((Double) results.get("SALARY"));

        return emp;
		
		
	}
	private static class MyStoredProcedure extends StoredProcedure{
		
			 public MyStoredProcedure(DataSource ds) {
		            super(ds, "GET_EMP_DATA");
		            this.setFunction(false); //false -> indicates its a stored procedure
		            SqlParameter[] params={
		            		new SqlParameter("NAME", Types.VARCHAR),
		                    new SqlOutParameter("NO", Types.INTEGER),
		                    new SqlOutParameter("DESG", Types.VARCHAR),
		                    new SqlOutParameter("SALARY", Types.DOUBLE)
		            		
		            };
		            this.setParameters(params);
		            compile();
		}
			 public Map myexecute(String name) {
		            HashMap map = new HashMap();
		            map.put("NAME", name);
		            return super.execute(map);
		        }
	}

}
