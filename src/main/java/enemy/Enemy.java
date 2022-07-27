package enemy;

import enums.Weapons;
import player.Player;
import player.fighters.Fighter;

public abstract class Enemy {

    private String name;
    private int health;
    private Weapons weapons;



    public Enemy(String name, int health, Weapons weapons) {
        this.name = name;
        this.health = health;
        this.weapons = weapons;
    }

    public int getHealth() {
        return health;
    }

    public void removeHealth(int damage){
        this.health -= damage;
    }

    public void attack(Player player){
        player.removeHealth(weapons.getDamageValue());
    }




}
