<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Register" method="post">
<table>
<tr>
<td>name:</td><td><input type="text" name="name" value=<%=request.getAttribute("first_name")%>></td>
<%if(request.getAttribute("name")!=null) { %>
<td><font size='3' color='red'>Invalid Name!!</font></td>
<% }%> 
</tr>
<tr>
<td>city:</td><td><input type="text" name="city"></td>
<%if(request.getAttribute("city")!=null) { %>
<td><font size='3' color='red'>Invalid city!!</font></td>
<% }%> 
</tr>
<tr>
<td><input type="submit" value="submit"></td>
</tr>
</table>

</form>
</body>
</html>