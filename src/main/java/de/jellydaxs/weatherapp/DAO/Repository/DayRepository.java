package de.jellydaxs.weatherapp.DAO.Repository;

import de.jellydaxs.weatherapp.DAO.Entities.Day;
import org.springframework.data.repository.CrudRepository;

public interface DayRepository extends CrudRepository<Day,Long> {
}
