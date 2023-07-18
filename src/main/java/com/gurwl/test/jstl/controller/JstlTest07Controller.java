package com.gurwl.test.jstl.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gurwl.test.jstl.domain.Weather;
import com.gurwl.test.jstl.service.JstlTest07Service;

@Controller
public class JstlTest07Controller {
	
	@Autowired
	private JstlTest07Service jstlTest07Service;
	
	@GetMapping("/jstl/test07")
	public String test07(Model model) {

		List<Weather> weatherList = jstlTest07Service.getWeatherList();
		
		model.addAttribute("weatherList", weatherList);
		
		return "jstl/test07";
	}
	
	@GetMapping("/jstl/test07_input")
	public String test07Input() {
		return "jstl/test07_input";
	}
	
	@PostMapping("/jstl/test07_insert")
	public String test07Insert(
			@RequestParam("date") String date,
			@RequestParam("weather") String weather,
			@RequestParam("microDust") String microDust,
			@RequestParam("temperature") double temperature,
			@RequestParam("precipitation") double precipitation,
			@RequestParam("windSpeed") double windSpeed
			) throws ParseException {
		
		jstlTest07Service.insertWeather(date, weather, microDust, temperature, precipitation, windSpeed);
		return "redirect:test07";
	}
}
