<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
	<br>
	<form:form action="search" method="POST" commandName="tiles">
		<center>
			<table>
				<tr>
					<td>Design Number</td>
					<td><form:input path="designNo" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="SEARCH"></td>
				</tr>
			</table>
		</center>
	</form:form>

</body>
</html>