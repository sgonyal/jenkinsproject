<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="studentupdate">
<div style="border: '5px solid gray '; background: offwhite;width: '300px'; height: '150px'">
<%-- ROLL NO:<input type="number" id="rollno" name="rollno" value="${sdata.rollno }" readonly="readonly">
 --%>NAME: <input type="text" id="name" name="name" value="${sdata.name }">
USERNAME: <input type="text" id="username" name="username" value="${sdata.username }">
PASSWORD: <input type="password" id="password" name="password" value="${sdata.password }">
<input type="submit" value="SUBMIT">
</div>
</form>
</body>
</html>