package asw.instagnam.ricetteseguite.domain.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"followed", "follower"})})
public class Connessione {

	@Id
	@GeneratedValue
	private Long id;
	private String followed;
	private String follower;

	public Connessione(String followed, String follower){
		this.followed = followed;
		this.follower = follower;
	}
}
