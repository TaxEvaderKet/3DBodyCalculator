package Libraries; //insert comment here
import java.util.Scanner;
interface cylinderBase {
    static double calculation(double radius, double radiusBase){
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        input.close();
        radiusBase = (radius * radius) * Math.PI;
        return radiusBase;
    }
}