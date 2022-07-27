package room;

import enemy.Enemy;
import enemy.troll.Troll;
import player.Player;
import player.fighters.fighterType.Knight;

import java.util.ArrayList;

public class Room {

    private String name;
    private int treasure;

    private Knight knight;
    private Troll troll;

    public Room(Knight knight,Troll troll,String name, int treasure) {
        this.knight = knight;
        this.troll = troll;
        this.name = name;
        this.treasure = treasure;

    }

    public String getName() {
        return name;
    }

    public int getTreasure() {
        return treasure;
    }



}
