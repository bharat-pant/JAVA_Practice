package com.company;
import java.util.Scanner;
class ViceCity{
    public ViceCity(String input){
        System.out.println("Your Character is " + input);
    }
    public void hit(){
        System.out.println(" I am hitting");
    }
    public void run(){
        System.out.println("I am running");
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner scan_value = new Scanner(System.in);
        int val = scan_value.nextInt();
        String sc = scan_value.next();
        ViceCity vc = new ViceCity(sc);
        if (val == 1) {
            vc.hit();
        } else if (val == 2) {
            vc.run();
        } else {
            System.out.println(" Please enter either 1 or 2");
        }
    }
}
