package exercises;

import java.util.Scanner;

/**
 * Created by henry on 7/22/18.
 */
public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gas;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the number of miles driven: ");
        miles = in.nextDouble();
        System.out.println("Enter the number of gallons of gas consumed: ");
        gas = in.nextDouble();
        mpg = miles/gas;
        System.out.println("Your miles-per-gallon is: " + mpg);
    }
}
