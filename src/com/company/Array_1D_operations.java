package com.company;
import java.util.Scanner;
public class Array_1D_operations {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        int no_of_elements = scan_value.nextInt();
        int [] value_array = new int[100];
        for (int i=0; i<no_of_elements; i++)
        {
            int val = scan_value.nextInt();
            value_array[i] = val;
        }
        for (int i=0; i<no_of_elements; i++)
        {
            System.out.print(value_array[i]+" ");
        }
    }
}
