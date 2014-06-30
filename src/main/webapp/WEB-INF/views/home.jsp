<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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

<script type="text/javascript">
     $('#ajax').click(function(){ 
         $.ajax({ 
             type: "GET",
             dataType: "json", //set dataType to be charset=utf-8 to see json
             url: "http://api.openweathermap.org/data/2.5/weather?q=London",
             success: function(data){
            	test.innerHTML = data;
             }
         });
    }); 
    
/*     $('#ajax').click(function(){ 
    	$.getJSON('http://api.openweathermap.org/data/2.5/weather?q=London', function(data) {
            $.each(data, function(index, element) {
                $('body').append($('<div>', {
                    text: element.name
                }));
            });
        });
    }); */

    </script>

</body>
</html>
