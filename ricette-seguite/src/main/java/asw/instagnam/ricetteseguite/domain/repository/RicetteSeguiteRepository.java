package asw.instagnam.ricetteseguite.domain.repository;

import asw.instagnam.ricetteseguite.domain.entities.RicetteSeguite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RicetteSeguiteRepository extends JpaRepository<RicetteSeguite, Long> {
    List<RicetteSeguite> findAllByFollowerId(String followerId);
}

