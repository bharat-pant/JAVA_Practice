package com.company;
import java.util.Scanner;
public class String_to_lower_case {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        String value = scan_value.nextLine();
        String updated_value = value.toLowerCase();
        System.out.println(updated_value);


    }
}
