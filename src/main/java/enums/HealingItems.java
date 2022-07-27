package enums;

public enum HealingItems {

    PORTIONS("Portion1",5),
    HERBS("Herbs",10);

    private final String portionName;
    private final int healingPower;

    HealingItems(String portionName, int healingPower) {
        this.portionName = portionName;
        this.healingPower = healingPower;
    }

    public String getPortionName() {
        return portionName;
    }

    public int getHealingPower() {
        return healingPower;
    }











}
