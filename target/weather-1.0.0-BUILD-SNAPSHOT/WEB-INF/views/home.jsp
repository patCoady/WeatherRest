<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home</title>
<script type="text/javascript"
	src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<p id="test"></p>

	<button id="ajax">ajax local Weather</button>
	<button id="forecastAjax">ajax forecast</button>
	<div>
		<feildset>
		<form name="localWeather" action="weather" method="post" id="findWeather"
			onsubmit="return fetch_weather();">
			<input type="hidden" name="weatherJson" id="weatherJson" /> 
			<input type="text" name="city" id="cityName" required />
			<button type="submit">local Weather</button>
		</form>
		</feildset>
	</div>

	<div>
		<feildset>
			<form name="forecast" action="forecast" method="post">
				<input type ="hidden" name = "forecastJson" id = "forecastJson"/>
				<input type="text" name="city" id="forecastCityName" required />
				<button type = "submit">5 day Forecast</button>
			</form>
		</feildset>
	</div>

	<%-- <p>${weather.main.temp_min}</p> --%>


	<script type="text/javascript">
		$('#ajax').click(function() {
							var weatherURL = "http://api.openweathermap.org/data/2.5/weather?q="
									.concat(document.getElementById("cityName").value);
							$.ajax({
								type : "GET",
								dataType : "charset=utf-8", //set dataType to be charset=utf-8 to see json
								url : weatherURL,
								success : function(data) {
									/* weatherJson.innerHTML = data; */
									$("#weatherJson").val(data);
								}
							});
						});
	</script>
	<script type="text/javascript">
		$('#forecastAjax').click(function() {
							var weatherURL = "http://api.openweathermap.org/data/2.5/forecast/daily?q=London";
							$.ajax({
								type : "GET",
								dataType : "charset=utf-8", //set dataType to be charset=utf-8 to see json
								url : weatherURL,
								success : function(data) {
									/* weatherJson.innerHTML = data; */
									alert(data);
									$("#forecastJson").val(data);
								}
							});
						});
	</script>
	
	<!-- function fetch_weather() { -->
	<script type="text/javascript">
		$('#findWeather')
				.submit(
						function() {
							var weatherURL = "http://api.openweathermap.org/data/2.5/forecast/daily?lat=35&lon=139&cnt=10&mode=json";
									/* .concat(document.getElementById("cityName").value); */
							$.ajax({
								type : "GET",
								dataType : "charset=utf-8", //set dataType to be charset=utf-8 to see json
								url : weatherURL,
								success : function(data) {
									/*  var txt = document.getElementById('weatherJson');
									 txt.value = data; */
									$("#weatherJson").val(data);
									return true;
								}
							});
						});
	</script>

</body>
</html>
