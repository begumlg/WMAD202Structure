package ca.ciccc.wmad202.assignment1.question5;

import java.util.Scanner;

public class Question5 {
    public static final double PI = 3.14;

    public  void  circleArea() {
        System.out.format("Please enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        float radius = scanner.nextFloat();

        System.out.format("The radius is %f and the area is %f" ,radius,radius*radius*PI);

    }
}
