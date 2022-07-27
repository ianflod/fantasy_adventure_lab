package player.fighters;

import enemy.Enemy;
import enums.Weapons;
import player.Player;

public abstract class Fighter extends Player {

    private Weapons weapon;

    public Fighter(String name, int health , int gold, Weapons weapon) {
        super(name,health,gold);
        this.weapon = weapon;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        enemy.removeHealth(this.weapon.getDamageValue());
    }


}
