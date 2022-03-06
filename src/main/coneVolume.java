/**
 * yet another calculator by @TaxEvaderKet on GitHub
 * by the way, these have no particular license to follow, since everyone can do this.
 */
package src.main;
import java.util.Scanner;
public class coneVolume {
    static double height; //correct me if I am wrong on this
    static double base;
    static double radius;
    static double volume;
    static String unit;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        height = input.nextDouble();
        radius = input.nextDouble();
        unit = input.next();
        base = Math.PI * (radius * radius);
        volume = (base * height) / 3;
        switch (unit){
            case "m":
             volume = volume / 1000000;
                break;
            case "cm":
             volume = volume + 0;
                break;
        }
        input.close();
        System.out.println("The volume of your Cone is " + volume + unit + "³");

    }
}