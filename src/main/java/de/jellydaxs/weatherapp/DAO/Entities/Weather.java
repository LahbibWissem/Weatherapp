package de.jellydaxs.weatherapp.DAO.Entities;


import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;

    public Weather() {
    }

    public Weather(Long id, String cityName, Set<Day> days) {
        this.cityName = cityName;
        this.days = days;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Day> days ;

    public Set<Day> getDays() {
        return days;
    }

    public void setDays(Set<Day> days) {
        this.days = days;
    }
}
