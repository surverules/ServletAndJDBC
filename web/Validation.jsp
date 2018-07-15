<%--
  Created by IntelliJ IDEA.
  User: surverules
  Date: 6/17/2018
  Time: 8:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passed Validation</title>
</head>
<body>
<% if (session.getAttribute("validRequest").equals("Yes")) {%>
<h1> Passed Validation </h1>
<% } else {%>
<h1> Failed Validation </h1>
<% }%>

<form action="/EmpServlet" method="get">
    Click Submit to see Employee Details <input type="submit" name="submit" >

</form>

</body>
</html>
