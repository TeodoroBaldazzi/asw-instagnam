package asw.instagnam.ricetteseguite.domain;

import asw.instagnam.ricetteseguite.domain.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    private User fixture;

    @Before
    public void setUp() {
        this.fixture = new User("userId");
    }

    @Test
    public void getAllRicetteSeguite_WithUserThatFollowOneUser_EachUserHasOneRicetta() {
        User user = createUser();
        user.addRicetta(createRicetta());
        fixture.addFollowing(user);

        Set<Ricetta> actual = fixture.getAllRicetteSeguite();

        assertEquals(1, actual.size());
    }

    @Test
    public void getAllRicetteSeguite_WithUserThatFollowTwoUsers_EachUserHasTwoRicette() {
        User user1 = createUser();
        user1.addRicetta(createRicetta());
        User user2 = createUser();
        user2.addRicetta(createRicetta());

        fixture.addFollowing(user1);
        fixture.addFollowing(user2);

        Set<Ricetta> actual = fixture.getAllRicetteSeguite();

        assertEquals(2, actual.size());
    }

    @Test
    public void getAllRicetteSeguite_WithUserThatFollowTwoUsers_FirstUserHasOneRicettaSecondUserHasTwoRicette() {
        User user1 = createUser();
        user1.addRicetta(createRicetta());
        User user2 = createUser();
        user2.addRicetta(createRicetta());
        user2.addRicetta(createRicetta());

        fixture.addFollowing(user1);
        fixture.addFollowing(user2);

        Set<Ricetta> actual = fixture.getAllRicetteSeguite();

        assertEquals(3, actual.size());
    }

    private User createUser(){
        return new User(randomString());
    }

    private Ricetta createRicetta(){
        return new Ricetta(randomLong(), randomString(), randomString());
    }

    private String randomString(){
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private Long randomLong(){
        Random random = new Random();
        return random.nextLong();
    }
}