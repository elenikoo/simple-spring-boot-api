package ge.ibsu.demo.controlers;

import ge.ibsu.demo.dto.FilmInfo;
import ge.ibsu.demo.dto.RequestData;
import ge.ibsu.demo.dto.SearchCustomer;
import ge.ibsu.demo.dto.SearchFilm;
import ge.ibsu.demo.entities.Customer;
import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.services.FilmService;
import ge.ibsu.demo.util.GeneralUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    private final FilmService filmService;

    @Autowired

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    @RequestMapping(value = "/search", method = RequestMethod.POST, produces = {"application/json"})
    public Page<FilmInfo> searchFilms(@RequestBody RequestData<SearchFilm> rd) throws Exception {
        GeneralUtil.checkRequiredProperties(rd.getData(), Arrays.asList("title", "description", "release_year", "language"));
        return filmService.search(rd.getData(), rd.getPaging());
    }
}
