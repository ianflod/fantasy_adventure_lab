package player.healers;
import enums.HealingItems;
import player.Player;

public class Healer extends Player {

    private HealingItems healingItems;


    public Healer(String name, int health, int gold,HealingItems healingItems) {
        super(name, health, gold);
        this.healingItems = healingItems;

    }


}
