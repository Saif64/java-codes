package learning.java;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int rnNumber = rn.nextInt(10);
        int limit = 0;
        boolean haswon = false;
        boolean shouldFinis = false;

        System.out.print("your name: ");
        String name = sc.next().toUpperCase();
        System.out.println("welcome " + name);
        System.out.println("do you want to play this game: \n1.Yes\n2.NO ");
        String choice = sc.next();

            if (choice.equals("yes") || choice.equals("yes")) {
                System.out.print("Guess a number: ");
                int userChoice = sc.nextInt();
                    while (!shouldFinis){
                        limit++;
                        if(limit < 5){
                            if (userChoice == rnNumber){
                                haswon = true;
                                shouldFinis = true;
                            }
                            else if(userChoice > rnNumber){
                                System.out.println("too high");
                                System.out.print("\t try again: ");
                                userChoice = sc.nextInt();
                            }

                            else if(userChoice <rnNumber){
                                System.out.println("too low");
                                System.out.print("\t try again: ");
                                userChoice = sc.nextInt();
                            }

                            else {
                                shouldFinis = true;
                            }

                        }
                    }
                if(haswon){
                    System.out.println("congratulations you have won the game");
                }
                else{
                    System.out.printf("game over");
                    System.out.println(rnNumber);
                }
            }
             else {
                System.out.println("Okay BYE BYE");
            }
    }

}
