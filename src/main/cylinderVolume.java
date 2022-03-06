/**
 * cylinder volume calculator by @Ket on GitHub
 * fairly simple but can be used for something, I guess
 */
package src.main;
import java.util.Scanner;
public class cylinderVolume{
   public static double BRadius; //declaring some variables here
   public static double height; 
   public static double base;
   public static double CVolume;
   public static String unit;
   public static Scanner input = new Scanner(System.in); //using a scanner
    public static void main(String[] args) { //main method
        System.out.println("enter the radius and height of your cylinder");
        BRadius = input.nextDouble(); //declaring the values of previously mentioned variables
        height = input.nextDouble();
        System.out.println("enter your measurment unit, only meter and centimeter, cm and m");
        unit = input.next();//now doing some calculation
        base = Math.PI * (BRadius * BRadius); //using the Math library of java and getting pi, 3.14 etc
        CVolume = base * height; 
        switch (unit) { //switch statement for the unit conversion
            case "m":
                CVolume = CVolume / 1000000;
                break;
            case "cm":
                CVolume = CVolume + 0;
                break;
        }
        System.out.println("the volume of your cylinder is " + CVolume + unit + "³"); //and now the output
    }
} //also going to make other geometrical bodies