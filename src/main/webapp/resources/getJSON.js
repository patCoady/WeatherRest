$.getScript("resources/OpenLayers.light.js", function(){


	$('#ajax').click(function() {
		var weatherURL = "http://api.openweathermap.org/data/2.5/weather?q="
				.concat(document.getElementById("cityName").value);
		$.ajax({
			type : "GET",
			dataType : "charset=utf-8", 
			url : weatherURL,
			success : function(data) {
				$("#weatherJson").val(data);
			}
		});
	});
	
	$('#forecastAjax').click(function() {
		var weatherURL = "http://api.openweathermap.org/data/2.5/forecast/daily?q="
				.concat(document.getElementById("cityName").value
						.concat("&units=imperial"));
		$.ajax({
			type : "GET",
			dataType : "charset=utf-8",
			url : weatherURL,
			success : function(data) {
				/* weatherJson.innerHTML = data; */
				
				$("#forecastJson").val(data);
			}
		});
	});
	
	
	
	
	
	 /*function fetch_weather() {*/
	
	$('#findWeather')
	.submit(
			function() {
				var weatherURL = "http://api.openweathermap.org/data/2.5/weather?q="
						.concat(document
								.getElementById("cityName").value);
				$.ajax({
					type : "GET",
					dataType : "charset=utf-8",
					url : weatherURL,
					success : function(data) {
						$("#weatherJson").val(data);
					}
				});
			});

	
	
	
});

