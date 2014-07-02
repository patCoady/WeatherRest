<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home</title>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/resources/getJSON.js" />"></script>

</head>
<body>
	<h1>The Weather n Stuff</h1>
	<button id="ajax">ajax local Weather</button>
	<button id="forecastAjax">ajax forecast</button>
	<div>

		<!--Weather for a day-->
		<input type="text" name="city" id="cityName" required />
		<feildset>
		<form name="localWeather" action="weather" method="post"
			id="findWeather" onsubmit="return fetch_weather();">
			<input type="hidden" name="weatherJson" id="weatherJson" />
			<button type="submit">local Weather</button>
		</form>
		</feildset>
	</div>
	<!--Weather for 5 days-->
	<div>
		<feildset>
		<form name="forecast" action="forecast" method="post">
			<input type="hidden" name="forecastJson" id="forecastJson" />
			<button type="submit">5 day Forecast</button>
		</form>
		</feildset>
	</div>
	<!--A map of the weather-->
<!-- 	<div>
		<feildset>
		<form name = "map" action ="map" method="post">
			<button type = "submit">Mr. Mappy</button>
		</form>
		</feildset>
	
	</div> -->




</body>
</html>
