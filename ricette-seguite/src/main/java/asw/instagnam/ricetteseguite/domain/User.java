package asw.instagnam.ricetteseguite.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    private String id;
    @ManyToMany
    private Set<User> following;
    @OneToMany
    private Set<Ricetta> ricette;

    public User(String userId) {
        this.id = userId;
        this.following = new HashSet<>();
        this.ricette = new HashSet<>();
    }

    public void addFollowing(User user){
        this.following.add(user);
    }

    public void addRicetta(Ricetta ricetta) {
        this.ricette.add(ricetta);
    }

    public Set<Ricetta> getAllRicetteSeguite(){
        return following.stream().map(User::getRicette).flatMap(Collection::stream).collect(Collectors.toSet());
    }
}
