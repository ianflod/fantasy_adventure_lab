package player.magicUsers;

import enums.Spells;
import player.Player;

public abstract class MagicUser extends Player {

    private Spells spells;

    public MagicUser(String name , int health, int gold, Spells spells) {
        super(name,health,gold);
        this.spells = spells;
    }

    public Spells  getSpells() {
        return spells;
    }



}
