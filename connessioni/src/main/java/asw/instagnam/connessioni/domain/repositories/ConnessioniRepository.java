package asw.instagnam.connessioni.domain.repositories;

import asw.instagnam.connessioni.domain.entities.Connessione;
import asw.instagnam.connessioni.domain.entities.ConnessioneId;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConnessioniRepository extends JpaRepository<Connessione, ConnessioneId> {

	public List<Connessione> findAll();
    
	public boolean existsByFollowerAndFollowed(String follower, String followed);
	
	public List<Connessione> findAllByFollower(String follower);
	
	public Connessione findByUuid(Long id);
}
