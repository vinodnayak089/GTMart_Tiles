<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    .container {
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .image-container {
        margin-right: 20px;
        align-items: left
    }
</style>
</head>
<body bgcolor="lightblue">
    <div class="container">
        <div class="image-container" align="left">
            <img src="data:image/png;base64,${tiles.base64EncodedImageFile}" alt="Image" width="300" height="300">
        </div>
        <table border=1>
            <tr>
                <td>Box Size</td>
                <td>${tiles.boxSize}</td>
            </tr>
            <tr>
                <td>Design No</td>
                <td>${tiles.designNo}</td>
            </tr>
            <tr>
                <td>Light</td>
                <td>${tiles.l}</td>
            </tr>
            <tr>
                <td>High Lighter</td>
                <td>${tiles.hl}</td>
            </tr>
            <tr>
                <td>Dark</td>
                <td>${tiles.d}</td>
            </tr>
            <tr>
                <td>Flooring</td>
                <td>${tiles.f}</td>
            </tr>
            <tr>
                <td>Prize</td>
                <td>${tiles.prize}</td>
            </tr>
        </table>
    </div>
</body>
</html>
