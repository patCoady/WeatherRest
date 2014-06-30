<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
	<script type="text/javascript" src="<c:url value="/resources/jquery-1.4.min.js" />"></script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<p id ="test"></p>

<button id="ajax">ajax call</button>
<div>
	<feildset>
	<form name="weather" action="weather" method="post" id= "findWeather" onsubmit ="fetch_weather()">
		<input type = "hidden" name ="weatherJson" id = "weatherJson"/>
		<input type = "text" name ="city" id ="cityName" required/>
		<button type="submit">Save</button>
	</form>
	</feildset>
</div>

	<%-- <p>${weather.main.temp_min}</p> --%>


<script type="text/javascript">
     $('#ajax').click(function(){ 
    	 var weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=".concat(document.getElementById("cityName").value);
    	 alert(weatherURL);
         $.ajax({ 
             type: "GET",
             dataType: "charset=utf-8", //set dataType to be charset=utf-8 to see json
             url: weatherURL,
             success: function(data){
            	weatherJson.innerHTML = data;
            	$("#weatherJson").val(data);
            	/* alert(data); */
             }
         });
    }); 
    
    </script>
<!-- function fetch_weather() { -->
<!-- <script type="text/javascript">
$('#findWeather').submit(function() {
    $.ajax({ 
        type: "GET",
        dataType: "charset=utf-8", //set dataType to be charset=utf-8 to see json
        url: "http://api.openweathermap.org/data/2.5/weather?q=London",
        success: function(data){
       	weatherJson.innerHTML = data;
       	$("#weatherJson").val(data);
       	/* alert(data); */
        }
    });
}); 
    
    </script> -->

</body>
</html>
