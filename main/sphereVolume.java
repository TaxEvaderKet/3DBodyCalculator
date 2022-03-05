/**
 * Another calculator for a three-dimensional body, have fun, 9th graders.
 * by @TaxEvaderKet on GitHub
 */


package main;
import java.util.Scanner;
public class sphereVolume { //3rd and counting...
    static double radius;
    static double volume;
    static String unit;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the radius of your sphere.");
        radius = input.nextDouble();
        switch (unit) {
            case "m":
             volume = volume / 1000000;
            break;

            case "cm":
             volume = volume - 0;
            break;
        }
        volume = 4 / 3 * Math.PI * (radius * radius * radius);
        unit = input.next();
        input.close();
    }
}
