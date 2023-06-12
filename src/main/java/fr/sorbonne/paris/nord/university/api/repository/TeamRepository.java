package fr.sorbonne.paris.nord.university.api.repository;

import fr.sorbonne.paris.nord.university.api.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends JpaRepository {

}
