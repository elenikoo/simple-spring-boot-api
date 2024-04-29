package ge.ibsu.demo.repositories;

import ge.ibsu.demo.dto.FilmInfo;
import ge.ibsu.demo.entities.Film;
import ge.ibsu.demo.entities.Language;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    @Query("select new ge.ibsu.demo.dto.FilmInfo(f.title, f.description, f.rating) From Film f where " +
            "concat(f.title, ' ', f.description, ' ', f.release_year, ' ', f.language) like %:searchValue%")
    Page<FilmInfo> searchFilm(Pageable pageable, @Param("searchValue") String searchValue);

}
