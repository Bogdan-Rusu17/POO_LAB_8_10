package lab03.inheritance;

public class EnchantedRuneAxe extends Weapon {
    private double extraDamage;

    public EnchantedRuneAxe(int strength, double armorPenetration, double extraDamage) {
        super(strength, armorPenetration);
        this.extraDamage = extraDamage;
    }

    public void applyCurse(Hero hero) {
        hero.setCurse("Weakness");
    }

    public void takeDurabilityDamage(int damage, int curseDamage) {
        super.takeDurabilityDamage(damage);
        durability += curseDamage;

    }

    @Override
    public void dealDamage(Hero hero) {
        super.dealDamage(hero);
        hero.takeDamage(extraDamage);
    }
}
