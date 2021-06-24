package com.company;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    int number;
    int userInput;
    public GuessTheNumber(){
        Random random = new Random();
        number = random.nextInt(1000);
    }
    public void UserInput(){
        Scanner scan_value = new Scanner(System.in);
        userInput = scan_value.nextInt();
    }
    public void checkUserInput(){
        if (userInput>number){
            System.out.println("You guessed a bit high");
        }
        else if (userInput<number){
            System.out.println("You guessed a bit low");
        }
        else {
            System.out.println("You guessed it right");
        }
    }
    public static void main(String[] args) {
        int count=0;
        GuessTheNumber gtn = new GuessTheNumber();
        while (gtn.userInput!=gtn.number){
            gtn.UserInput();
            gtn.checkUserInput();
            count++;
        }
        System.out.println("You won");
        System.out.println("You took " + count + " tries to figure out correct number");


    }
}
