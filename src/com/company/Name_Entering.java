package com.company;
import java.util.Scanner;
public class Name_Entering {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        System.out.println("Enter your Full Name!!");
        String name = scan_value.nextLine();
        System.out.println("Your full name is " + name + ". Welcome to JAVA Programming World");

    }
}
