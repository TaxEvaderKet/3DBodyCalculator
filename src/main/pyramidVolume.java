/**
 * a pyramid volume calculator by
 * @TaxEvaderKet on
 * @GitHub
 */
package src.main;
import java.util.Scanner;
public class pyramidVolume {
    static double BLength; //same thing here, just adapting to the formula for a pyramid
    static double BWidth;
    static double Height;
    static double Base;
    static double PVolume;
    static String unit;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Length, The Width and the Height of your pyramid. (3 values)");
        Height = input.nextDouble();
        BLength = input.nextDouble();
        BWidth = input.nextDouble();
        System.out.println("enter the unit of the result that will be displayed (cm or m)");
        unit = input.next();
        Base = BLength * BWidth;
        PVolume = (Base * Height) / 3;
        System.out.println("The volume of your pyramid is " + PVolume + unit + "³");
    }
}
