<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped-columns">
 <thead>
   <tr>
   <th>ROLL NUMBER</th>
   <th>NAME</th>
   <th>USERNAME</th>
   <th>PASSWORD</th>
    <th>ACTION</th>
   </tr>
 </thead>
 <tbody>
 <c:forEach items="${sdata}" var="s">
 <tr>
 <td>${s.rollno}</td>
 <td>${s.name}</td>
 <td>${s.username}</td>
 <td>${s.password}</td>
  <td> <a href="delete?rollno=${s.rollno}">Delete</a> ||<a href="edit?rollno=${s.rollno}">Edit</a>  </td>
 </tr>
 </c:forEach>
 </tbody>
</table>
</body>
</html>