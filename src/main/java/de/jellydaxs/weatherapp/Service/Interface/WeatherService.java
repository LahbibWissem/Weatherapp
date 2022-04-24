package de.jellydaxs.weatherapp.Service.Interface;

import de.jellydaxs.weatherapp.DAO.Entities.Day;
import de.jellydaxs.weatherapp.DAO.Entities.Weather;

import java.util.List;

public interface WeatherService {
    List<Weather> getAll();
    Weather getWeatherByCityName(String cityName);
    Weather addWeather(Weather weather);
    void deleteWeatherById(Long id);
    void addDayToWeather(Weather w , Day d);
    int countAllWeathers();
}
