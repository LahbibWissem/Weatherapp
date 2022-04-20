package de.jellydaxs.weatherapp.DAO.Repository;

import de.jellydaxs.weatherapp.DAO.Entities.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather,Long> {
    Weather findWeatherByCityName(String cityName);
}
