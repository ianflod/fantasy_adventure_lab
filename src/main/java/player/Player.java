package player;

public abstract class Player {

    private String name;
    private int health;
    private int gold;

    public Player(String name, int health , int gold) {
        this.name = name;
        this.health = health;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getGold() {
        return gold;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void removeHealth(int damage){
        this.health -= damage;
    }
}
