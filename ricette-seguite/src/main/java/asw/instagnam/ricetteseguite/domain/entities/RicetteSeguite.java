package asw.instagnam.ricetteseguite.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"follower", "idRicetta"})})
public class RicetteSeguite {

	@Id
	@GeneratedValue
	private Long id;
	private String follower;
	private Long ricettaId;
	private String autoreRicetta;
	private String titoloRicetta;


	public RicetteSeguite(String follower, Long ricettaId, String autoreRicetta, String titoloRicetta) {
		this.follower = follower;
		this.ricettaId = ricettaId;
		this.autoreRicetta = autoreRicetta;
		this.titoloRicetta = titoloRicetta;
	}

	public Ricetta getRicetta(){
		return new Ricetta(ricettaId, autoreRicetta, titoloRicetta);
	}
}
