package ge.ibsu.demo.services;

import ge.ibsu.demo.dto.FilmInfo;
import ge.ibsu.demo.dto.Paging;
import ge.ibsu.demo.dto.SearchFilm;
import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public List<Film> getAll() {
        return filmRepository.findAll();
    }


    public Page<FilmInfo>searchFilm(SearchFilm searchFilm, Paging paging){
        String searchText = searchFilm.getSearchText() != null ? "%" + searchFilm.getSearchText() + "%" : "";
        Pageable pageable = PageRequest.of(paging.getPage() - 1, paging.getSize(), Sort.by("id").descending());
        return filmRepository.searchFilm(pageable, searchText);
    }

}
