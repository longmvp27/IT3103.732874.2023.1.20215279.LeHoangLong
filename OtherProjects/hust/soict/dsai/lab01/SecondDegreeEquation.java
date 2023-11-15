package OtherProjects.hust.soict.dsai.lab01;
// Exercise 2.2.6: The second-degree equations with one variable
import java.util.Scanner;
import java.lang.Math;
public class SecondDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter number a: ");
        a = sc.nextDouble();
        System.out.println("Enter number b: ");
        b = sc.nextDouble();
        System.out.println("Enter number c: ");
        c = sc.nextDouble();
        if(a == 0) {
            System.out.println("x = " + (-c/b));
        }
        double delta = Math.pow(b, 2) - (4*a*c);
        if(delta < 0) {
            System.out.println("The equation has no solutions!");
        } else if(delta == 0) {
            System.out.println("x1 = x2 = " + -b/(2*a));
        } else {
            double x1 = (-b-Math.sqrt(delta)) / (2*a);
            double x2 = (-b+Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1 + "\n" + "x2 = " + x2);
        }
    }
}
