package OtherProjects.hust.soict.itep.lab01;
// Exercise 6.5: Write a Java program to sort a numeric array & calculate the sum and average value
import java.util.Arrays;
import java.util.Scanner;

public class SortAndCalArray {

    public static void main(String[] args) {
        System.out.println("Le Hoang Long - 20215279");
        int n;
        int sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        //Initialize array
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        //sort arrays
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        //Calculate sum & avg
        avg = (float)sum/n;
        System.out.println("Sum = " + sum + "\n" + "Avg = " + avg);
    }

}
