package libraries; //I am doing these interfaces for later on.
import java.util.Scanner;
public interface triangleBase {
    static double calc(double baseSide, double height, double base){
        Scanner input = new Scanner(System.in);
        baseSide = input.nextDouble();
        height = input.nextDouble();
        base = (baseSide * height) / 2;
        input.close();
        return base;
    }
}
