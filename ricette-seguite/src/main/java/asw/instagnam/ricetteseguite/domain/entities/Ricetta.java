package asw.instagnam.ricetteseguite.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor
public class Ricetta {

	@Id
	@GeneratedValue
	private Long id;
	private String autore;
	private String titolo;

	public Ricetta(Long id, String autore, String titolo) {
		this();
		this.id = id;
		this.autore = autore; 
		this.titolo = titolo;
	}
	
}
