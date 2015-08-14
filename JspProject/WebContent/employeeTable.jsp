<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
}
body {
    background-image: url("paper.gif");
}

th {
    background-color: green;
    color: white;
}
</style>

</head>
<body >
<%
    String [] jay = {"jayram","tutor"};
    String [] rukmini = {"rukmini","student"};
    String [] baba ={"johnny","child"};
    String[][] humans = {jay,rukmini,baba};
   

%>
<table border="1" style="width:100%">
<thead>
<tr><td>Name</td><td>Profession</td></tr>
<%-- <%
/* for(int i=0;i<humans.length;i++){
	String human[]=humans[i];
	out.println("<tr>");
	
	for(int j=0;j<human.length;j++){
		out.println("<td>"+human[j]+"</td>");
	}
	out.println("</tr>");
} */
%> --%>
<%
for(int i=0;i<humans.length;i++){
	String human[]=humans[i];
	%>
	<tr>
	<%
	for(int j=0;j<human.length;j++){
		%>
		<td><%=human[j] %></td>
		<%
	}
	%>
	</tr>
	<%
}
%>
<%-- <tr><td><%= jay[0] %></td><td><%= jay[1] %></td></tr>
<tr><td><%= rukmini[0] %></td><td><%= rukmini[1] %></td></tr> --%>
</thead>
</table>
</body>
</html>