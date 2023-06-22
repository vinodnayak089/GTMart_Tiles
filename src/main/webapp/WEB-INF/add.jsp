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
	<form:form action="add" method="POST" commandName="tiles" enctype="multipart/form-data">
		<table>
			<tr>
				<td>Image File</td>
				<td><input type="file" class="file" name="imageFile"/></td>
			</tr>
			<tr>
					<td>Design Number</td>
					<td><form:input path="designNo" /></td>
				</tr>
				<tr>
					<td>Design Size</td>
					<td><form:input path="boxSize" /></td>
				</tr>
				<tr>
					<td>Quantity Light</td>
					<td><form:input path="l" /></td>
				</tr>
				<tr>
					<td>Quantity High Lighter</td>
					<td><form:input path="hl" /></td>
				</tr>
				<tr>
					<td>Quantity Dark</td>
					<td><form:input path="d" /></td>
				</tr>
				<tr>
					<td>Quantity Floor</td>
					<td><form:input path="f" /></td>
				</tr>
				<tr>
					<td>prize</td>
					<td><form:input path="prize" /></td>
				</tr>
			<tr>
				<td>ADD</td>
				<td><input type="submit" value="ADD" /></td>
				<br></td>
			</tr>
		</table>
	</form:form>

</body>
</html>