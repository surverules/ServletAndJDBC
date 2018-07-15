<%@ page import="com.ubs.business.Employee" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: surverules
  Date: 6/17/2018
  Time: 5:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="empee" class="com.ubs.business.Employees"></jsp:useBean>
<jsp:useBean id="emp" class="com.ubs.business.Employee"></jsp:useBean>

<html>
<head>
    <title>Employee List</title>
</head>
<body>

<h1> Employee List </h1>

<table border="1" width="100%">
    <tr>
        <th>FName </th>
        <th>Lname </th>
        <th>Department </th>
        <th>Salary </th>
    </tr>
    <% empee.initialLoad();
        ArrayList cognizant = empee.getCognizant();
        Iterator iterator = cognizant.iterator();
        while(iterator.hasNext()){
            emp = (Employee) iterator.next();

        %>
    <tr>
        <td><%=emp.getFname()%></td>
        <td><%=emp.getLname()%></td>
        <td><%=emp.getDept()%></td>
        <td><%=emp.getSalary()%></td>
    </tr>
    <% }%>

</table>

</body>
</html>
