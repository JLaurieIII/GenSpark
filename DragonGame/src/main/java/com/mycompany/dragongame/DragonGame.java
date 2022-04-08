package com.mycompany.dragongame;

import java.util.Scanner;

public class DragonGame {

    public static void main(String[] args) {
        
        openingPrint();
        
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        
        if (userInput == 1) {
            System.out.println("You approach the first cave...");
            System.out.println ("It is dark and spooky...");
            System.out.println ("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println ("Gobbles you down in one bite!");
        } else if (userInput == 2) {
            System.out.println("You approach the second cave...");
            System.out.println ("It is dark but you see a light flickering in the distance...");
            System.out.println ("A large dragon jumps out in front of you! He smiles and...");
            System.out.println("Leads you to the treasure chest!");
        } else {
            System.out.println("Invalid input, please enter the number 1 or 2");
        }
        
    }
           
    public static void openingPrint() {
        System.out.println("You are in a land full of dragons. In front of you, ");
        System.out.println("you see two caves. In one cave, the dragon is friendly ");
        System.out.println("and will share his treasure with you. The other dragon ");
        System.out.println("is greedy and hungry and will eat you on sight. ");
        System.out.println("Which cave will you go into? (1 or 2)");
    }
}
