<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue" style="align-content: center;">
		<br>
		<br>
		<table border=1>
			<tr>
                 <td> Box Size </td>
                 <td>${tiles.boxSize}</td>
			</tr>
			<tr>
                 <td> Design No </td>
                 <td>${tiles.designNo}</td>
			</tr>
			<tr>
                 <td> Light </td>
                 <td>${tiles.l}</td>
			</tr>
			<tr>
                 <td> High Lighter </td>
                 <td>${tiles.hl}</td>
			</tr>
			<tr>
                 <td> Dark </td>
                 <td>${tiles.d}</td>
			</tr>
			<tr>
                 <td> Flooring </td>
                 <td>${tiles.f}</td>
			</tr>
			<tr>
                 <td> Prize </td>
                 <td>${tiles.prize}</td>
			</tr>
		</table>

</body></html>