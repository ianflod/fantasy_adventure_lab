package player.fighters.fighterType;

import enums.Weapons;
import player.fighters.Fighter;

public class Barbarian extends Fighter {

    private Weapons weapon;

    public Barbarian(String name, int health, int gold, Weapons weapon) {
        super(name, health, gold, weapon);

    }


}
