package Humanoid;

public class Goblin extends Humanoid {

    public Goblin() {

        super((int) (Math.random() * 20) + 21, (int) (Math.random() * 3) + 1);
    }

    @Override
    public Humanoid attack(Humanoid target) {
        int damageModifier = (int) (Math.random() * 3) + 1;
        int damageDealt = damage * damageModifier;

        ((Human) target).setHealth(((Human) target).getHealth() - damageDealt);

        return target;
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
