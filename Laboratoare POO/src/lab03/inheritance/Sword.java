package lab03.inheritance;

public class Sword extends Weapon {
    public Sword(int strength, double armorPenetration) {
        super(strength, armorPenetration);
    }

    @Override
    public void dealDamage(Hero hero) {
        super.dealDamage(hero);
        hero.takeDamage((float) strength / 2);
    }
}
