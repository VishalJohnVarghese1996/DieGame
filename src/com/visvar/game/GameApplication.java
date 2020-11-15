package com.visvar.game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameApplication {

    public static void main(String[] args) {
        printMenu();
        Scanner scan = new Scanner(System.in);
        while (true){
            int option = scan.nextInt();
            switch (option){
                case 1:
                    Die userDie = new Die();
                    Die compDie = new Die();
                    userDie.roll();
                    compDie.roll();
                    userDie.roll();;
                    compDie.roll();
                    System.out.println("\nUser outcomes : ");
                    userDie.printOutcomes();
                    System.out.println("\nComputer outcomes : ");
                    compDie.printOutcomes();
                    if((userDie.getSumOfOuts())==7 && (compDie.getSumOfOuts())==7){
                        System.out.println("\nGAME IS A TIE\n_______________________\n");
                    }else if ((userDie.getSumOfOuts())==7){
                        System.out.println("\nCONGRATULATIONS..!!! YOU WON THE GAME\n___________________\n");
                    }else if((compDie.getSumOfOuts())==7){
                        System.out.println("\nYOU LOST, COMPUTER WON THE GAME\n _____________________\n");
                    }else {
                        System.out.println("\nGAME IS A TIE\n___________________\n");
                    }
                    printMenu();
                    break;
                case 2: return;
            }
        }
    }

    static void printMenu(){
        System.out.println("TWO DIE ROLLING GAME MENU\n1. Roll dies\n2. Exit");
        System.out.println("Choose your option");
    }
}

