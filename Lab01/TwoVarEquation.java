package Lab01;
// Exercise 2.2.6: The system of first-degree equation with two variable
import java.util.Scanner;
public class TwoVarEquation {
    public static double CalculateD(double a11, double a12, double a21, double a22) {
        return a11*a22 - a21*a12;
    }
    public static double CalculateD1(double a12, double a22, double b1, double b2) {
        return a22*b1 - a12*b2;
    }
    public static double CalculateD2(double a11, double a21, double b1, double b2) {
        return a11*b2 - a21*b1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a11, a12, a21, a22, b1, b2;
        double x1, x2;
        a11 = sc.nextDouble();
        a12 = sc.nextDouble();
        a21 = sc.nextDouble();
        a22 = sc.nextDouble();
        b1 = sc.nextDouble();
        b2 = sc.nextDouble();
        if(CalculateD(a11, a12, a21, a22) == 0) {
            System.out.println("The equation has no solutions");
            System.exit(0);
        }
        x1 = CalculateD1(a12, a22, b1, b2) / CalculateD(a11, a12, a21, a22);
        x2 = CalculateD2(a11, a21, b1, b2) / CalculateD(a11, a12, b1, b2);
        System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);

    }
}
