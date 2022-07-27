import enums.Spells;
import org.junit.Before;
import org.junit.Test;
import player.magicUsers.magicuserTypes.Warlock;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void setUp(){
        warlock = new Warlock("Dav", 100, 20, Spells.FIRE);

    }

    @Test
    public void warlockHasName(){
        assertEquals("Dav", warlock.getName());
    }

    @Test
    public void warlockHasSpell(){
        assertEquals("FireStarter", warlock.getSpells().getSpellName());
    }



}
