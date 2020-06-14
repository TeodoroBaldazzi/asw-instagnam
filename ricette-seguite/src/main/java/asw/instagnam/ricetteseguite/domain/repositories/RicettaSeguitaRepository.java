package asw.instagnam.ricetteseguite.domain.repositories;

import asw.instagnam.ricetteseguite.domain.compkeys.RicettaSeguitaId;
import asw.instagnam.ricetteseguite.domain.entities.RicettaSeguita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RicettaSeguitaRepository extends JpaRepository<RicettaSeguita, RicettaSeguitaId> {
	
	List<RicettaSeguita> findAllByFollower(String follower);

}