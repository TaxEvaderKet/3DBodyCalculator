package Libraries;
import java.util.Scanner;
interface squareBase {
    static double calc(double a, double base){
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        base = Math.pow(a, 3);
        input.close();
        return base;    
    }
}
