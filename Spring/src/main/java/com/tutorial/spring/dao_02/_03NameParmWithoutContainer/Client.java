package com.tutorial.spring.dao_02._03NameParmWithoutContainer;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

public class Client {
	public static void main(String[] args) {
		SingleConnectionDataSource ds = new SingleConnectionDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		ds.setUsername("hr");
		ds.setPassword("hr");

		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(ds);
		String qry = "select count(*) from employees where job_id = :desg";
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("desg", "ST_MAN");
		int count = template.queryForInt(qry, params);
		System.out.println("No of clerks are : " + count);
		ds.destroy();
	}
}
