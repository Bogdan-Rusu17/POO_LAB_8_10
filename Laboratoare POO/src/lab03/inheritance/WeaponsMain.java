package lab03.inheritance;

public class WeaponsMain {
    public static void main(String[] args) {
        Weapon[] weapons = new Weapon[2];

        Sword sword = new Sword(200, 0.2);
        EnchantedRuneAxe runeAxe = new EnchantedRuneAxe(300, 0.3, 20);

        sword.showStats(); // upcasting because we have the method defined in the parent class
        runeAxe.showStats(); // same as above

        weapons[0] = sword;
        weapons[1] = runeAxe;

        Hero hero = new Hero(1000, "Almighty");
        ((EnchantedRuneAxe)weapons[1]).applyCurse(hero); // explicit down cast to a child class of weapon

        weapons[0].dealDamage(hero); // method overriding of dealDamage() in child classes aka runtime polymorphism
        System.out.println("Hero's health is "  + hero.getHealth());
        weapons[1].dealDamage(hero); // method overriding of dealDamage() in child classes aka runtime polymorphism
        System.out.println("Hero's health is "  + hero.getHealth());

        weapons[0].takeDurabilityDamage(10); // upcasting for calling method inside parent class
        ((EnchantedRuneAxe)weapons[1]).takeDurabilityDamage(10, 5); // method overriding + explicit downcast

        System.out.println("Sword durability is " + sword.getDurability());
        System.out.println("Rune Axe durability is " + runeAxe.getDurability());

    }
}
