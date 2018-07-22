package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by henry on 7/22/18.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in;
        Double area;
        Double radius;

        in = new Scanner(System.in);

        do {
            System.out.println("Enter the radius of the circle: ");
            radius = in.nextDouble();
            if (radius >= 0) {
                area = 3.14159 * radius * radius;
                System.out.println("The area of a circle of radius " + radius + " is " + area);
            }
        } while(radius < 0);
    }

}
