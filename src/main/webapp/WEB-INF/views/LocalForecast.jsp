<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forecast</title>
</head>
<body>
<h1>Forecast for ${forecast.city.name}</h1>
<table>
	<tr>
		<th>City</th><th>Clouds</th><th>Low</th><th>High</th><th>Description</th>
	</tr>
	
		<c:forEach items = "${forecast.list}" var ="day">
		<tr>
			<td>${day.temp.day}</td>
		</tr>
		</c:forEach>
			
<%-- 		<td>${forecast.list.clouds}</td>
		<td>${forecast.list.temp.temp_min}</td>
		<td>${forecast.list.temp.temp_max}</td> --%>
		<%-- <td>${weather.weather.description}</td> --%>
</table>


</body>
</html>