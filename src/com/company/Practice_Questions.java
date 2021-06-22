package com.company;

class PerimeterAndArea{
    int side;
    int breadth;
    int perimeter;
    int constructor_check_value;
    public PerimeterAndArea(){
        side = 0;
        breadth = 0;
        perimeter=0;
        constructor_check_value=100;
        System.out.println("Constructor is running");

    }
    public int area(){
        return side*breadth;
    }
    public int perimeter(int val1){
        side = val1;
        return 4*side;
    }
    public int perimeter(int val1, int val2){
        side = val1;
        breadth = val2;
        return 2*(side+breadth);
    }
    public int area(int val1){
        side = val1;
        return side*side;
    }
    public int area(int val1, int val2){
        side = val1;
        breadth = val2;
        return side * breadth;
    }

}
public class Practice_Questions {
    public static void main(String[] args) {
        PerimeterAndArea PAA = new PerimeterAndArea();
        int perimeter = PAA.perimeter(5);
        int perimeter2 = PAA.perimeter(20,40);
        int area = PAA.area(5);
        int area2 = PAA.area(20,40);
        System.out.println("Perimeter 1 = " + perimeter + " and Perimeter 2 = " + perimeter2);
        System.out.println("Area 1 = " + area + " and Area 2 = " + area2);
        System.out.println("Default Perimeter and Area = " + PAA.area());
        System.out.println("Constructor value" + PAA.constructor_check_value);

    }
}
