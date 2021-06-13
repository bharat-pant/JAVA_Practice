package com.company;
import java.util.Scanner;
public class Loops_factorial_for_loops {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        int n = scan_value.nextInt();
        int fact =1;
        for (int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        System.out.println("The answer of the factorial problem is ");
        System.out.println(fact);

    }
}
