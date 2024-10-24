package lab03.inheritance;

public class Weapon {
    protected int durability = 100;
    protected int strength;
    protected double armorPenetration;

    public Weapon(int strength, double armorPenetration) {
        this.strength = strength;
        this.armorPenetration = armorPenetration;
    }

    public void showStats() {
        System.out.println("Strength: " + strength + ", Armor penetration: " + armorPenetration + ", Durability: " + durability);
    }

    public void takeDurabilityDamage(int damage) {
        durability -= damage;
    }

    public void dealDamage(Hero hero) {
        hero.takeDamage(strength * (1 + armorPenetration));
    }

    public int getDurability() {
        return durability;
    }
}
