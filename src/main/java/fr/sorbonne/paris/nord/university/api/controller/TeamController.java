package fr.sorbonne.paris.nord.university.api.controller;

import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.api.service.ITeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Team")
public class TeamController {

    @GetMapping("/hello")
    public String getTeams()
    {
        return "hello world";
    }
    private final ITeamService teamService;

    public TeamController (ITeamService teamService) {
        this.teamService = teamService;
    }
    @PostMapping("/create")
    public TeamEntity create(@RequestBody TeamEntity teamEntity){
        return teamService.create(teamEntity);
    }
    @GetMapping("/read")
    public List<TeamEntity> read(){
        return teamService.read();
    }

    @PutMapping("/update/{id}")
    public Optional<TeamEntity> update(@PathVariable long id, @RequestBody TeamEntity teamEntity){
        return teamService.update(id,teamEntity);
    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable long id){
        return teamService.delete(id);
    }
}

