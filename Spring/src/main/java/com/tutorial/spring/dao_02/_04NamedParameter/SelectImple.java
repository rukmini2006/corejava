package com.tutorial.spring.dao_02._04NamedParameter;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class SelectImple implements SelectInter {
	NamedParameterJdbcTemplate nt;
	String qry = "select count(*) from employees where employee_id >= :e1 and employee_id <= :e2";

	public void setNt(NamedParameterJdbcTemplate nt) {
		this.nt = nt;
	}

	public int getEmpCount(int eno1, int eno2) {
		// TODO Auto-generated method stub
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("e1", new Integer(eno1));
		params.addValue("e2", new Integer(eno2));
		int count = nt.queryForInt(qry, params);
		return count;
	}

}
