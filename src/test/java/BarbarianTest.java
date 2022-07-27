import enemy.troll.Troll;
import enums.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.fighters.fighterType.Barbarian;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Troll enemy;

    @Before
    public void setUp(){
        barbarian = new Barbarian("Conan", 100, 20, Weapons.MACE);
        enemy = new Troll("Gary", 100, Weapons.AXE);
    }

    @Test
    public void barbarianHasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void barbarianHasWeapon(){
        assertEquals("Mace", barbarian.getWeapon().getWeaponType());
    }

    @Test
    public void canAttackEnemy(){
        barbarian.attack(enemy);
        assertEquals(50, enemy.getHealth());
    }

    @Test
    public void canTakeDamage(){
        enemy.attack(barbarian);
        assertEquals(75,barbarian.getHealth());
    }

}
