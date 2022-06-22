package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class GoblinAttackZombie implements Assignment {
    // ↓↓↓↓ your code goes here ↓↓↓↓

    /*
    public String determineOutcome(Zombie zombie) {

        var target = (Zombie)zombie;

        if (target.getHealth() < 0) {
            return "ermmm I am still alive!";
        } else {
            return "Zombie is alive, therefore it is not a zombie!";
        }
    }

     */

    public String determineOutcome(Zombie zombie) {

        var target = (Zombie) zombie;


        if (target.getHealth() < 0) {
            return "ermmm I am still alive!";
        } else {
            return "Zombie is alive, therefore it is not a zombie!";
        }

    }



















}
