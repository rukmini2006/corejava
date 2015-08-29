<%@taglib prefix="test" uri="/WEB-INF/tlds/SubstrDescriptor.tld" %>
<html>
<head>
<title>JSP Custom TagLib Example:Substr function</title>
</head>

<body>
SUBSTR(GOODMORNING,1,6) is <br>
<%-- <%
	out.println("GOODMORNING".substring(1,6));
%> --%>
<font color="blue">
   <test:substring input="GOODMORNING" start="1" end="6"/>
    </font>
   
</body>
</html>