package asw.instagnam.ricetteseguite.domain.repository;

import asw.instagnam.ricetteseguite.domain.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RicettaRepository extends JpaRepository<Ricetta, Long> {
}

