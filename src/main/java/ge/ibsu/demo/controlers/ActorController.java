package ge.ibsu.demo.controlers;

import ge.ibsu.demo.entities.Actor;
import ge.ibsu.demo.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ActorController {
    private final ActorService actorService;



    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }
    @GetMapping
    public ResponseEntity<List<Actor>> getAllActors() {
        List<Actor> actors = actorService.getAllActors();
        return new ResponseEntity<>(actors, HttpStatus.OK);
    }
}
