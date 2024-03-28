package ge.ibsu.demo.repositories;

import ge.ibsu.demo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    @Query("SELECT new Actor(a.firstName, a.lastName) FROM Actor a")
    List<Actor> findAllActorsWithNames();
}
