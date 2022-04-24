package de.jellydaxs.weatherapp.DAO.Repository;

import de.jellydaxs.weatherapp.DAO.Entities.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface DayRepository extends JpaRepository<Day,Long> {
    List <Day> findAllByOrderByNumAsc();
}
