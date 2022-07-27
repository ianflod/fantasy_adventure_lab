package enums;

public enum Weapons {

    SWORD("Sword",20),
    AXE("Axe",25),
    CLUB("Club",15),
    MACE("Mace",50),
    CROSSBOW("Crossbow",10);

    private String weaponType;
    private int weaponDamage;

    Weapons(String weaponType, int weaponDamage) {
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public int getDamageValue() {
        return weaponDamage;
    }
}
