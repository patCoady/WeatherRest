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