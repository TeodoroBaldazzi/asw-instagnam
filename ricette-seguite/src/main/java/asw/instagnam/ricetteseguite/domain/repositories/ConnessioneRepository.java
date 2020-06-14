package asw.instagnam.ricetteseguite.domain.repositories;

import asw.instagnam.ricetteseguite.domain.compkeys.ConnessioneId;
import asw.instagnam.ricetteseguite.domain.entities.Connessione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConnessioneRepository extends JpaRepository<Connessione, ConnessioneId> {

     List<Connessione> findAllByFollower(String follower);

     List<Connessione> findAllByFollowed(String followed);

}