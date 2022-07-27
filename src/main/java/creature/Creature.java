package creature;

public abstract class Creature {

    private String name;
    private int shield;

    public Creature(String name, int shield) {
        this.name = name;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }
}
