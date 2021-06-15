package com.company;
import java.util.Scanner;
public class Loops_pattern_print {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        int no_of_rows = scan_value.nextInt();
        for (int i=no_of_rows; i>0; i--)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
