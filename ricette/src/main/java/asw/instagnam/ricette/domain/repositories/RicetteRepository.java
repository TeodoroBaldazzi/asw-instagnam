package asw.instagnam.ricette.domain.repositories;

import asw.instagnam.ricette.domain.entities.RicettaCompleta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RicetteRepository extends JpaRepository<RicettaCompleta, Long> {

	public List<RicettaCompleta> findAll();
    
	public boolean existsByAutoreAndTitolo(String autore, String titolo);
	
	public List<RicettaCompleta> findAllByAutore(String autore);
	
	public RicettaCompleta findByUuid(Long id);

}