package ge.ibsu.demo.controlers;

import ge.ibsu.demo.dto.ActorInfo;
import ge.ibsu.demo.dto.FilmInfo;
import ge.ibsu.demo.dto.RequestData;
import ge.ibsu.demo.dto.SearchFilm;
import ge.ibsu.demo.entities.Actor;
import ge.ibsu.demo.services.ActorService;
import ge.ibsu.demo.util.GeneralUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ActorController {
    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @RequestMapping(value = "/searchActor", method = RequestMethod.POST, produces = {"application/json"})
    public List<ActorInfo> search() {
        return actorService.searchActor();
    }
}
