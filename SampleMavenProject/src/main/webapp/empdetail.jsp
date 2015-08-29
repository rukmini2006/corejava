<%@page import="com.DO.EmployeeDO,java.util.List"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>

<%-- <% 
	java.util.List<EmployeeDO> empDOList = (List<EmployeeDO>)request.getAttribute("empdetail");
	
	for(EmployeeDO empdo : empDOList){
		out.println(empdo.getEmpid());
		out.println(empdo.getFname());
		out.println(empdo.getLname());
		out.println(empdo.getEmail() +" <br>");
	}
%>
 --%>
<%-- <% 
	java.util.List<EmployeeDO> empDOList = (List<EmployeeDO>)request.getAttribute("empdetail");
	
	for(EmployeeDO empdo : empDOList){
%>
	<%=empdo.getEmpid()%>
	<%=empdo.getFname()%>
	<%=empdo.getLname()%>
	<%=empdo.getEmail()%>
<%		
	}
%> --%>

<table border="1" style="width:100%">
<tr>
<th>EMPID</th>
<th>Fname</th>
<th>Lname</th>
<th>Email</th>
</tr>

<c:forEach var="emp" items="${empdetail}">

  <tr>
  <td><c:out value="${emp.empid}"/></td>
  <td><c:out value="${emp.fname}"/></td>
  <td><c:out value="${emp.lname}"/></td>
 <td> <c:out value="${emp.email}"/></td>
 </tr>
</c:forEach>


</table>
	</body>
	
</html>