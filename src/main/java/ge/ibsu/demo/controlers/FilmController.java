package ge.ibsu.demo.controlers;

import ge.ibsu.demo.dto.SearchCustomer;
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


    @GetMapping("/films")
    public ResponseEntity<Page<Film>> searchFilms(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String description,
            @RequestParam(required = false) Integer releaseYear,
            @RequestParam(required = false) String language,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Page<Film> films = filmService.searchFilms(title, description, releaseYear, language, page, size);
        return new ResponseEntity<>(films, HttpStatus.OK);
    }
}
