package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Customer;
import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public Page<Film> searchFilms(String title, String description, int releaseYear, String language, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return filmRepository.searchFilms(title, description, releaseYear, pageable);
    }




}
