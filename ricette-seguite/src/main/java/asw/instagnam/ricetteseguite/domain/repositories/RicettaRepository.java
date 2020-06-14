package asw.instagnam.ricetteseguite.domain.repositories;

import asw.instagnam.ricetteseguite.domain.compkeys.RicettaId;
import asw.instagnam.ricetteseguite.domain.entities.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RicettaRepository extends JpaRepository<Ricetta, RicettaId> {
    
	List<Ricetta> findAllByAutore(String autore);

}