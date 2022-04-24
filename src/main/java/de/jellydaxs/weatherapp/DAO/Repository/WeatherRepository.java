package de.jellydaxs.weatherapp.DAO.Repository;

import de.jellydaxs.weatherapp.DAO.Entities.Weather;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.awt.*;

public interface WeatherRepository extends CrudRepository<Weather,Long> {
    Weather findWeatherByCityName(String cityName);
    @Query("SELECT COUNT (w) FROM Weather w ")
    int countAll();

}
