package Lab01;
// Exercise 6.6: Write a Java program to add 2 matrices of the same size

import java.util.Scanner;

public class AddSameMatrices {
    public static void inputArr(int[][] arr, int row, int col, String arrName) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("%s[%d][%d] = ",arrName,  i, j);
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void printArr(int[][] arr, int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    public static void addMatrices(int[][] arrA, int[][] arrB, int[][] arrC, int row, int col) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arrC[i][j] = arrA[i][j] + arrB[i][j];
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Enter row: ");
        row = sc.nextInt();
        System.out.println("Enter col: ");
        col = sc.nextInt();

        int[][] arrA = new int[row][col];
        int[][] arrB = new int [row][col];
        int[][] arrC = new int [row][col];
        inputArr(arrA, row, col, "arrA");
        printArr(arrA, row, col);
        inputArr(arrB, row, col, "arrB");
        printArr(arrB, row, col);
        addMatrices(arrA, arrB, arrC, row, col);
        System.out.println("The matrice result is: \n");
        printArr(arrC, row, col);


    }
}
