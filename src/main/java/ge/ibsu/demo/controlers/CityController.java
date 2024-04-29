package ge.ibsu.demo.controlers;

import ge.ibsu.demo.dto.CityWithCountry;
import ge.ibsu.demo.entities.City;
import ge.ibsu.demo.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = {"application/json"})    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<City> addCity(@RequestBody City city) {
        City savedCity = cityService.addCity(city);
        return new ResponseEntity<>(savedCity, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/cityId", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Void> removeCity(@PathVariable Long cityId) {
        cityService.removeCity(cityId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/searchCityWithCountry", method = RequestMethod.GET, produces = {"application/json"})
    public List<CityWithCountry>searchCityWithCountry(){
        return cityService.searchCityWithCountry();
    }




}