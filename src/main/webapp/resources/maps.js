$.getScript("resources/OpenLayers.js", function() {
	// Center of map
	var lonlat = new OpenLayers.LonLat(0, 0);
	
	
	var map = new OpenLayers.Map("basicMap");
	// Create OSM overlays
	var mapnik = new OpenLayers.Layer.OSM();
	
	

    var layer_cloud = new OpenLayers.Layer.XYZ(
        "clouds",
        "http://${s}.tile.openweathermap.org/map/clouds/${z}/${x}/${y}.png",
        {
            isBaseLayer: false,
            opacity: 0.7,
            sphericalMercator: true
        }
    );

    var layer_precipitation = new OpenLayers.Layer.XYZ(
        "precipitation",
        "http://${s}.tile.openweathermap.org/map/precipitation/${z}/${x}/${y}.png",
        {
            isBaseLayer: false,
            opacity: 0.7,
            sphericalMercator: true
        }
    );


    map.addLayers([mapnik, layer_precipitation, layer_cloud]);

});

