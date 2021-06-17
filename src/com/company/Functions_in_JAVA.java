package com.company;
import java.util.Scanner;
public class Functions_in_JAVA {
    static void multiplication_table (int n)
    {
        int i = 1;
        while (i<=10)
        {
            int answer = n*i;
            System.out.println(n + " X " + i + " = " + answer);
            i++;
        }
    }
    static void pattern_print(int n)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int recursive_pattern(int n)
    {
        if (n==1)
        {
            System.out.print("*");
            return 0;
        }
        else
        {
            for (int i =n; i>0; i--)
            {
                System.out.print("*");
            }
            System.out.println("");
            return recursive_pattern(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        //System.out.println("Enter a number to obtain its table");
        System.out.println("Enter depth of pattern");
        int input = scan_value.nextInt();
        //multiplication_table(input);

        recursive_pattern(input);
    }
}
