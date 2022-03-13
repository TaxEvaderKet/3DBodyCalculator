package libraries; //insert comment here
import java.util.Scanner;
public interface cylinderBase {
    static double calculation(double radius, double radiusBase){ //I made my own vsc theme btw
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        input.close();
        radiusBase = (radius * radius) * Math.PI;
        return radiusBase;
    }
}