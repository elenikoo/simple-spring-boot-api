package ge.ibsu.demo.repositories;

import ge.ibsu.demo.dto.ActorInfo;
import ge.ibsu.demo.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    @Query("select new ge.ibsu.demo.dto.ActorInfo(a.firstName, a.lastName) from Actor a")
    List<ActorInfo> searchActor();


}
