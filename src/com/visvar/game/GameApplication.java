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
                case 1: int userDieOut1 = ThreadLocalRandom.current().nextInt(1, 7);
                    int userDieOut2 = ThreadLocalRandom.current().nextInt(1, 7);
                    int computerDieOut1 = ThreadLocalRandom.current().nextInt(1, 7);
                    int computerDieOut2 = ThreadLocalRandom.current().nextInt(1, 7);
                    System.out.println("\nUser outcomes : ");
                    printOutcomes(userDieOut1,userDieOut2);
                    System.out.println("\nComputer outcomes : ");
                    printOutcomes(computerDieOut1, computerDieOut2);
                    if((userDieOut1+userDieOut2)==7 && (computerDieOut1+computerDieOut2)==7){
                        System.out.println("GAME IS A TIE\n");
                    }else if ((userDieOut1+userDieOut2)==7){
                        System.out.println("CONGRATULATIONS..!!! YOU WON THE GAME\n");
                    }else if((computerDieOut1+computerDieOut2)==7){
                        System.out.println("YOU LOST, COMPUTER WON THE GAME\n");
                    }else {
                        System.out.println("GAME IS A TIE\n");
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
    static void printOutcomes(int out1, int out2){
        System.out.println("Die 1 outcome : " + out1);
        System.out.println("Die 2 outcome : " + out2);
    }
}

