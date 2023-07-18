package com.gurwl.test.jstl.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.gurwl.test.jstl.domain.Weather;

@Repository
public interface JstlTest07Repository {
	//날씨 정보를 모두 조회
	public List<Weather> selectWeatherHistory();
	
	public int insertWeather(
		@Param("date") Date date,
		@Param("weather") String weather,
		@Param("microDust") String microDust,
		@Param("temperature") double temperature,
		@Param("precipitation") double precipitation,
		@Param("windSpeed") double windSpeed
	);
}
