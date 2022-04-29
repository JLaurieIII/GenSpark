package Humanoid;

public class Human extends Humanoid {

    public Human(String name) {

        super(name, 100, 2); // initializes health to 100 and damage to 2.
    }

    @Override
    public Humanoid attack(Humanoid target) {

        int damageModifier = (int) (Math.random() * 3) + 1;
        int damageDealt = damageModifier * damage;

        ((Goblin) target).setHealth(((Goblin) target).getHealth() - damageDealt);

        return target;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", weaponDamage=" + damage +
                '}';
    }
}