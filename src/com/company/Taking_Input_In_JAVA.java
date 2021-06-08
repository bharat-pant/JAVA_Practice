package com.company;
import java.util.Scanner;
public class Taking_Input_In_JAVA {
    public static void main(String[] args) {

        //Cresting object for Scanner class
        Scanner scan_value = new Scanner(System.in);

        // Printing a complete sentence using nextLine() method
        System.out.println("Enter String that needs to be printed");
        String str = scan_value.nextLine();
        System.out.println(str);

        //checking integer value using hasNextInt() method
        System.out.println("Enter something to check whether it is an integer or not");
        boolean check = scan_value.hasNextInt();
        System.out.println(check);
    }
}
