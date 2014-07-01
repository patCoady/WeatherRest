<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Local Weather</title>

</head>
<body>

<table>
	<tr>
		<th>City</th><th>Clouds</th><th>Low</th><th>High</th><th>Description</th>
	</tr>
	<tr>
		<td>${weather.name}</td>
		<td>${weather.clouds.all}</td>
		<td>${weather.main.temp_min}</td>
		<td>${weather.main.temp_max}</td>
		<%-- <td>${weather.weather.description}</td> --%>
	</tr>
</table>




</body>
</html>