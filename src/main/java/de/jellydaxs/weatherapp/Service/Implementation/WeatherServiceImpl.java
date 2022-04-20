package de.jellydaxs.weatherapp.Service.Implementation;

import de.jellydaxs.weatherapp.DAO.Entities.Day;
import de.jellydaxs.weatherapp.DAO.Entities.Weather;
import de.jellydaxs.weatherapp.DAO.Repository.DayRepository;
import de.jellydaxs.weatherapp.DAO.Repository.WeatherRepository;
import de.jellydaxs.weatherapp.Service.Interface.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WeatherServiceImpl implements WeatherService {
    @Autowired
    WeatherRepository weatherRepository;
    @Autowired
    DayRepository dayRepository;

    @Override
    public List<Weather> getAll() {
        return (List<Weather>)weatherRepository.findAll();
    }

    @Override
    public Weather getWeatherByCityName(String cityName) {
        return weatherRepository.findWeatherByCityName(cityName);
    }

    @Override
    public Weather addWeather(Weather weather) {
        weatherRepository.save(weather);
        return weather;
    }

    @Override
    public void deleteWeatherById(Long id) {
        weatherRepository.deleteById(id);

    }

    @Override
    public void addDayToWeather(Weather w, Day d) {
       dayRepository.save(d);
       w.getDays().add(d);
       weatherRepository.save(w);
    }
}
