package ge.ibsu.demo.repositories;

import ge.ibsu.demo.dto.CityWithCountry;
import ge.ibsu.demo.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository <City, Long> {
    @Query("select new ge.ibsu.demo.dto.CityWithCountry(c.city, c.country.country) from City c")
    List<CityWithCountry> searchCityWithCountry();
}
