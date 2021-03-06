package com.patrick.weather.controller;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.patrick.weather.entity.LocalWeather;
import com.patrick.weather.entity.forecast.LocalForecast;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value="weather", method = RequestMethod.POST)
	public String doWeather_POST(Model model, @RequestParam("weatherJson") String weather){
		
		ObjectMapper objectMapper = new ObjectMapper();
		LocalWeather localWeather = null;
		
	try {
			localWeather = objectMapper.readValue(weather, LocalWeather.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		model.addAttribute("weather", localWeather);

		
		return "LocalWeather";
	}
	
	@RequestMapping(value="forecast", method = RequestMethod.POST)
	public String doForecast_POST(Model model, @RequestParam("forecastJson") String forecast){
		
		ObjectMapper objectMapper = new ObjectMapper();
		LocalForecast localForecast = null;
		
	try {
			localForecast = objectMapper.readValue(forecast, LocalForecast.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		model.addAttribute("forecast", localForecast);

		
		return "LocalForecast";
	}
	@RequestMapping(value="map", method = RequestMethod.POST)
	public String doMap_POST(Model model){
		
		return "map";
	}
	
}
