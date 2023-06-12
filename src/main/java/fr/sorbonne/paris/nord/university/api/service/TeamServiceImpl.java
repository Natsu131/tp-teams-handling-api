package fr.sorbonne.paris.nord.university.api.service;

import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import fr.sorbonne.paris.nord.university.api.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements ITeamService {
    //Le constructeur va initialiser a variable et le conteneur Spring va
    // injecter automatiquement l’objet TeamRepository dans la variable teamRepository
    private final TeamRepository teamRepository;

    public TeamServiceImpl(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    /**
     * @param teamEntity
     * @return
     */
    @Override
    public TeamEntity create(TeamEntity teamEntity) {
        return (TeamEntity) teamRepository.save(teamEntity);
    }

    /**
     * @return
     */
    @Override
    public List<TeamEntity> read() {
        return teamRepository.findAll();
    }
    /**
     * @param id
     * @param teamEntity
     * @return
     */
    @Override
    public Optional<TeamEntity> update(long id, TeamEntity teamEntity) {
        return teamRepository.findById(id);
    }
    //  public TeamEntity update(long id, TeamEntity teamEntity) {
    //        return teamRepository.findById(id)
    //                .map(t ->{
    //                    t.setId(t.getId());
    //                    return teamRepository.save(t);
    //
    //                }).orElseThrow() -> new RuntimeException("Pas d'équipe");
    //    }

    /**
     * @param id
     * @return
     */
    @Override
    public String delete(long id) {
        teamRepository.delete(id);
        return "Equipe supprimée";
    }
}
