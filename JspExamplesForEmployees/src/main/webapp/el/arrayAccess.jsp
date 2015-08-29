<%@page isELIgnored="true" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>

<% 
String [] bigFive={"U.S.A", "Russiaa" , "France", "China", "U.K"};

request.setAttribute("rukmini", bigFive);
%>

<c:out value="${rukmini }"></c:out><br>
<c:out value="${rukmini[0] }"></c:out><br>
<c:out value="${rukmini[  ' 1 ' ] }"></c:out>

<c:forEach var="val" items="${rukmini}">
 <c:out value="${val }"/>
<br>

</c:forEach>