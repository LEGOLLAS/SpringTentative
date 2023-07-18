package com.gurwl.test.jstl.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gurwl.test.jstl.domain.Weather;
import com.gurwl.test.jstl.repository.JstlTest07Repository;


@Service
public class JstlTest07Service {
	
	@Autowired
	private JstlTest07Repository jstlTest07Repository;
	
	public List<Weather> getWeatherList(){
		List<Weather> weatherList = jstlTest07Repository.selectWeatherHistory();
		return weatherList;
	}
	
	public int insertWeather(
			String date,
			String weather,
			String microDust,
			double temperature,
			double precipitation,
			double windSpeed
			) throws ParseException {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		Date convertDate = dateFormat.parse(date);
		
		return jstlTest07Repository.insertWeather(
				convertDate, 
				weather,
				microDust,
				temperature,
				precipitation,
				windSpeed
				);
	}
}
