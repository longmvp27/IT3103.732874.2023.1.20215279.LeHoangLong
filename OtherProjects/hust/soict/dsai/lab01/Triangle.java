package OtherProjects.hust.soict.dsai.lab01;
// Exercise 6.3: Display triangle with height of n star (*)
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int nHeight = sc.nextInt();
        for (int i = 0; i < nHeight; i++) {
            for (int j = 0; j < 2 * (nHeight - i) - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
