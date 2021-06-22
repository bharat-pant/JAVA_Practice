package com.company;
import java.util.Scanner;

public class Array_element_add_JAVA {
    static void add_element(int i)
    {
        Scanner scan_values = new Scanner(System.in);
        int [] element_array = new int[10];
        int input_value = scan_values.nextInt();
        element_array[i] = input_value;
        System.out.println(element_array[i]);
        for (int j=0; j<5; j++ )
        {
            System.out.print(element_array[j]+ " ");;
        }
    }
    public static void main(String[] args) {
        Scanner scan_values = new Scanner(System.in);
        int no_of_elements = scan_values.nextInt();
        for (int i=0; i<no_of_elements; i++ )
        {
            add_element(i);
        }

    }
}
