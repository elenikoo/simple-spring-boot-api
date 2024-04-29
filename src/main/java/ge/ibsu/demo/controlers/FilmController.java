package ge.ibsu.demo.controlers;

import ge.ibsu.demo.dto.FilmInfo;
import ge.ibsu.demo.dto.RequestData;
import ge.ibsu.demo.dto.SearchFilm;
import ge.ibsu.demo.services.FilmService;
import ge.ibsu.demo.util.GeneralUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    private final FilmService filmService;

    @Autowired

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    @RequestMapping(value = "/searchFilm", method = RequestMethod.POST, produces = {"application/json"})
    public Page<FilmInfo> search(@RequestBody RequestData<SearchFilm> rd) throws Exception {
        GeneralUtil.checkRequiredProperties(rd.getData(), Arrays.asList("searchText"));
        return filmService.searchFilm(rd.getData(), rd.getPaging());
    }

}
