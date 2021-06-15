package com.company;
import java.util.Scanner;
public class Loop_table_using_while {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        int number = scan_value.nextInt();
        int i =1;
        while(i <= 10)
        {
            int value = i*number;
            System.out.println(number + "X" + i + "=" + value);
            i++;
        }
    }
}
