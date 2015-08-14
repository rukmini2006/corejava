
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Displaying details of employees</title>
</head>
<body>

 <%
  	try{
  	 Class.forName("oracle.jdbc.driver.OracleDriver");
  	 
  	Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE","hr","hr");
  	
  	Statement st = con.createStatement();
  	
  	ResultSet rs =st.executeQuery("select * from employees");
  	%>
  	<table border="1" style="width:100%">
<thead>
<tr><td>EMPLOYEE_ID</td><td>FIRST_NAME</td><td>LAST_NAME</td></tr>
  	<% while(rs.next()){ 
  	%>
  	  <tr>
  	<td>	<%  out.println(rs.getInt("Employee_id")) ; %></td>
    <td><%= (rs.getString("First_Name"))  %></td>
    <td><%= (rs.getString("Last_Name"))  %></td>
        </tr> 
  		<%
  		  	}
	%>

    </table>
    	<%
  		  	}catch(Exception e){
 
  		e.printStackTrace();
 		
  	}finally{
  	}
 %>

</body>
</html>