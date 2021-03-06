package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Goblin implements Assignment{
    int strength;
    String stamina;
    String name;
    String color;

    // Do not change the constructor for goblin please!
    public Goblin() {
    }

    public Goblin(int strength){
        this.strength = strength;
    }


    public int getStrength() {
        return strength;
    }

    // ↓↓↓↓ your code goes here ↓↓↓↓

    /*
    public Zombie attack(Zombie zombie) {

        var target = (Zombie)zombie;

        target.setHealth(target.getHealth() + getStrength());

        return target;
    }

     */

    public Zombie attack(Zombie zombie){

        var target = (Zombie) zombie;

        target.setHealth(target.getHealth() + strength);
        return target;
    }
}
