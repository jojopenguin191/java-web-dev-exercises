package AreaOfCircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * radius * radius;
        System.out.println("The area of a circle of radius" + radius + "is: " + area);
    }
}
