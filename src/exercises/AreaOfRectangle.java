package exercises;

import java.util.Scanner;

/**
 * Created by henry on 7/22/18.
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        Double length;
        Double width;
        Double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = in.nextDouble();
        System.out.println("Enter the width of the rectangle: ");
        width = in.nextDouble();
        area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}
