package com.company;
import java.util.Scanner;
public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        System.out.println("Enter maximum marks of subject");
        float max_marks = scan_value.nextInt();
        System.out.println("Enter first test marks");
        float val1 = scan_value.nextInt();
        System.out.println("Enter second test marks");
        float val2 = scan_value.nextInt();
        System.out.println("Enter third test marks");
        float val3 = scan_value.nextInt();
        System.out.println("Enter fourth test marks");
        float val4 = scan_value.nextInt();
        System.out.println("Enter fifth test marks");
        float val5 = scan_value.nextInt();
        float total = ((val1+val2+val3+val4+val5)/(5*max_marks))*100;
        System.out.println("Your percentage is: ");
        System.out.print(total);
    }
}
