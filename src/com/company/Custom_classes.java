package com.company;
import java.util.Scanner;
class Employee{
    int salary;
    String name;
    int increment;
}
public class Custom_classes {
    public static void main(String[] args) {
        Employee Employee = new Employee();
        Scanner scan_value = new Scanner(System.in);
        String input = scan_value.next();
        Employee.salary = 50000;
        Employee.name = input;
        System.out.println(Employee.name);
        System.out.println(Employee.increment);
        System.out.println(Employee.salary);
    }
}

