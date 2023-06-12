package fr.sorbonne.paris.nord.university.api.service;

import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;

import java.util.List;
import java.util.Optional;


public interface ITeamService {
    TeamEntity create(TeamEntity teamEntity);
    List<TeamEntity> read();
    Optional<TeamEntity> update(long id, TeamEntity teamEntity);
    String delete(long id);
}
