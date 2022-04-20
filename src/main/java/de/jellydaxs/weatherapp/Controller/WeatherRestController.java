package de.jellydaxs.weatherapp.Controller;

import de.jellydaxs.weatherapp.DAO.Entities.Day;
import de.jellydaxs.weatherapp.DAO.Entities.Weather;
import de.jellydaxs.weatherapp.Service.Interface.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WeatherRestController {
    @Autowired
    WeatherService weatherService;


    // URL : http://localhost:8081/getAll
    @GetMapping("/getAll")
    public List<Weather> getAll(){
        return weatherService.getAll();
    }


    // URL : http://localhost:8081/addWeather
    @PostMapping("/addWeather")
    public Weather addWeather(@RequestBody Weather w){
        weatherService.addWeather(w);
        return w;
    }



    // URL : http://localhost:8081/getWeatherByCityName/El Alia
    @GetMapping("getWeatherByCityName/{cityName}")
    public Weather getWeatherByCityName(@PathVariable("cityName") String cityName) {
        return weatherService.getWeatherByCityName(cityName);
    }




    // URL : http://localhost:8081/deleteWeatherById/2
    @DeleteMapping("/deleteWeatherById/{Weather_id}")
    public void deleteWeatherById(@PathVariable("Weather_id")Long id) {
        weatherService.deleteWeatherById(id);
    }

    // URL : http://localhost:8081/addDayToWeather/El Alia
    @PostMapping("/addDayToWeather/{cityName}")
    public void addDayToWeather(@RequestBody Day d, @PathVariable("cityName") String cityName){
        Weather w = weatherService.getWeatherByCityName(cityName);
        weatherService.addDayToWeather(w,d);
    }
}
