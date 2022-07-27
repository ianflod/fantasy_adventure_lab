package player.healers.healerType;

import enums.HealingItems;
import player.healers.Healer;

public class Cleric extends Healer {

    public Cleric(String name, int health, int gold, HealingItems healingItems) {
        super(name, health, gold, healingItems);
    }
}
