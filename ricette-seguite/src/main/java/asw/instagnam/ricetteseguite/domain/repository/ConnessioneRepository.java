package asw.instagnam.ricetteseguite.domain.repository;

import asw.instagnam.ricetteseguite.domain.entities.Connessione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConnessioneRepository extends JpaRepository<Connessione, Long> {
    List<Connessione> findAllByFollowed(String autore);
}

