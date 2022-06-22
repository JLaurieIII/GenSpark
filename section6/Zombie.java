package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Zombie extends Humanoid implements Assignment{
    /*
    private int brainLust,strength,intelligence,health,compassion;

    public Zombie () {}

    // Default Constructor
    public Zombie(int brainLust, int strength, int intelligence, int health, int compassion) {
        this.brainLust = brainLust;
        this.strength= strength;
        this.intelligence = (intelligence);
        this.health = (health);
        this.compassion = (compassion);
    }

    public void setBrainLust(int brainLust)
    {
        this.brainLust = brainLust;
    }
    public int getBrainLust()
    {
        return brainLust;
    }

    public void setStrength(int str)
    {
        this.strength = str;
    }
    public int getStrength()
    {
        return strength;
    }

    public void setIntelligence(int intelligence)
    {
        this.intelligence = intelligence;
    }
    public int getIntelligence() {
        return intelligence;
    }

    public void setHealth(int hp)
    {
        this.health = hp;
    }
    public int getHealth() {
        return health;
    }

    public void setCompassion(int compassion)
    {
        this.compassion = compassion;
    }
    public int getCompassion() {
        return compassion;
    }

    public Class<?> whoIsTheParent(){

        return this.getClass().getSuperclass();
    }

    public String attack(Object target)
    {
        var victim = (Human)target;

        if (victim.getHealth() <= 3)
            return String.format("The zombie bites the human for %s damage, the human has died...", getStrength());
        else
            return String.format("The zombie bites the human for %s damage, the human survives but will be turning soon...", getStrength());
    }

     */

    private int brainLust, strength, intelligence, health, compassion;

    public Zombie() {}

    // Default Constructor
    public Zombie(int brainLust, int strength, int intelligence, int health, int compassion) {
        this.brainLust = brainLust;
        this.strength = strength;
        this.intelligence = intelligence;
        this.health = health;
        this.compassion = compassion;
    }

    //Getters
    public int getBrainLust() {return brainLust;}
    public int getStrength() {return strength;}
    public int getIntelligence() {return intelligence;}
    public int getHealth() {return health;}
    public int getCompassion() {return compassion;}

    //Setters
    public void setBrainLust(int brainLust) {this.brainLust = brainLust;}
    public void setStrength(int strength) {this.strength = strength;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
    public void setHealth(int health) {this.health = health;}
    public void setCompassion(int compassion) {this.compassion = compassion;}

    public Class whoIsTheParent(){

        return this.getClass().getSuperclass();
    }

    public String attack(Object target){

        var victim = (Human) target;

        victim.setHealth(victim.getHealth() - strength);

        if(victim.getHealth() <= 3) {
            return String.format("The zombie bites the human for %s damage, the human has died...", getStrength());
        } else {
            return String.format("The zombie bites the human for %s damage, the human survives but will be turning soon...", getStrength());
        }
    }
}
