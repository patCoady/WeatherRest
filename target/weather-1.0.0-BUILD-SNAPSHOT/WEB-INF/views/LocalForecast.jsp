<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forecast</title>
</head>
<body>

<table>
	<tr>
		<th>City</th><th>Clouds</th><th>Low</th><th>High</th><th>Description</th>
	</tr>
	<tr>
		<td>${forecast.city.name}</td>
		<c:forEach items = "${forecast.list}" var ="day">
			
		</c:forEach>
<%-- 		<td>${forecast.list.clouds}</td>
		<td>${forecast.list.temp.temp_min}</td>
		<td>${forecast.list.temp.temp_max}</td> --%>
		<%-- <td>${weather.weather.description}</td> --%>
	</tr>
</table>


</body>
</html>