/**
 * whatever this is by @TaxEvaderKet on GitHub
 * this is a past project and I will be tweaking it as mentioned
 */
package src.main;
import java.util.Scanner;
public class trapeziumVolume {
    static double aLength;
    static double cLength;
    static double HeightOf2d;
    static double surfaceOf2d; //will be calculated from a,c and height
    static double HeightOf3d;
    static double volumeOf3d; //it will be calculated from surfaceOf2d * heightOf3d
    static Scanner input = new Scanner(System.in);
    static String unit;
    public static void main(String[] args) { //had to fix it up because it had pre-entered values
        System.out.println("enter the values for the size of side \"a\" and size of side \"c\"");
        aLength = input.nextDouble();
        cLength = input.nextDouble();
        System.out.println("and now enter the height of the base and the height of the body");
        HeightOf2d = input.nextDouble();
        HeightOf3d = input.nextDouble();
        System.out.println("now select the unit (only cm or m)");
        unit = input.next();
        input.close(); //just realising how stupid I was just a few weeks ago
        switch (unit) {

            case "m":

                volumeOf3d = volumeOf3d / 1000000;

                break;

            case "cm":
                volumeOf3d = volumeOf3d + 0;

                break;
        }
        surfaceOf2d = aLength + cLength * HeightOf2d;
        volumeOf3d = surfaceOf2d * HeightOf3d;
        System.out.println("the volume of your trapezium is " + volumeOf3d + unit + "³");
    }
}