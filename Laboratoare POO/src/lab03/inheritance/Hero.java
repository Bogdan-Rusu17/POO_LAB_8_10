package lab03.inheritance;

public class Hero {
    private double health;
    private String name;
    private String curse;

    public Hero(float health, String name) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(double damage) {
        health -= damage;
    }

    public double getHealth() {
        return health;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }
}
