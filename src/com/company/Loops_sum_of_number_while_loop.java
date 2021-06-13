package com.company;
import java.util.Scanner;
public class Loops_sum_of_number_while_loop {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        int n = scan_value.nextInt();
        int sum = 0;
        while(n>0)
        {
            sum=sum+n;
            n--;
        }
        System.out.println("Sum of natural numbers till " + (n) + " is: ");
        System.out.println(sum);
    }
}
