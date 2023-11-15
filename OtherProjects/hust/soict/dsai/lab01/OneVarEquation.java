package OtherProjects.hust.soict.dsai.lab01;
// Exercise 2.2.6: Solve the first-degree equation with one variable
import java.util.Scanner;
public class OneVarEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;
        do {
            System.out.println("Enter number a: ");
            a = sc.nextFloat();
            System.out.println("Enter number b: ");
            b = sc.nextFloat();
        } while(a == 0);
        float result = -b/a;
        System.out.println("x = " + result);
    }
}
