package enums;

public enum Spells {

    STUN("Stun", 10),
    FIRE("FireStarter", 25),
    FREEZE("FreezeBalls", 15);

    private String spellName;
    private int spellDamage;

    Spells(String spellName, int spellDamage) {
        this.spellName = spellName;
        this.spellDamage = spellDamage;
    }

    public String getSpellName() {
        return spellName;
    }

    public int getSpellDamage() {
        return spellDamage;
    }
}
