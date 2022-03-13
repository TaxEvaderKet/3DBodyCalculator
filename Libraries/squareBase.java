package libraries;
import java.util.Scanner;
public interface squareBase {
    static double calc(double SideA, double base){
        Scanner input = new Scanner(System.in);
        SideA = input.nextDouble();
        base = Math.pow(SideA, 3);
        input.close();
        return base;
    }
}