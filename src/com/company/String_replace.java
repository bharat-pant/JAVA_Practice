package com.company;
import java.util.Scanner;
public class String_replace {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        String orginal = scan_value.nextLine();
        String find = scan_value.next();
        String replace = scan_value.next();
        String updated = orginal.replace(find,replace);
        String updated1 = updated.replace(" ", "_");
        System.out.println(updated);
        System.out.println(updated1);

    }
}
