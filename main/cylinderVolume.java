/**
 * cylinder volume calculator by Ket on GitHub
 * fairly simple but can be used for something, I guess
 */
package main;
import java.util.Scanner;
public class cylinderVolume{
   public static double radius; //declaring some variables here
   public static double height; 
   public static double base;
   public static double volume;
   public static String unit;
   public static Scanner input = new Scanner(System.in); //using a scanner
    public static void main(String[] args) { //main method
        System.out.println("enter the radius and height of your cylinder");
        radius = input.nextDouble(); //declaring the values of previously mentioned variables
        height = input.nextDouble();
        System.out.println("enter your measurment unit, only meter and centimeter, cm and m");
        unit = input.next();//now doing some calculation
        base = Math.PI * (radius * radius); //using the Math library of java and getting pi, 3.14 etc
        volume = base * height; 
        switch (unit) { //switch statement for the unit conversion
            case "m":
                volume = volume / 1000000;
                break;
            case "cm":
                volume = volume + 0;
                break;
        }
        System.out.println("the volume of your cylinder is " + volume + unit + "³"); //and now the output
    }
}