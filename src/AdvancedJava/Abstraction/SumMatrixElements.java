/*
Write a program that reads a matrix from the console and prints:
-The count of rows
-The count of columns
-The sum of all matrix’s elements
On the first line you will get the dimensions of the matrix in format {rows, columns}.
On the next lines you will get the elements for each row separated with a coma.
 */

package AdvancedJava.Abstraction;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().split(", ");
        int matrixRows = Integer.parseInt(inputArr[0]);
        int matrixCols = Integer.parseInt(inputArr[1]);
        int sum = 0;

        for(int row = 0; row < matrixRows; row++){
            String[] reminder = input.nextLine().split(", ");
            for(int col = 0; col < matrixCols; col++){
                sum += Integer.parseInt(reminder[col]);
            }
        }

        System.out.printf("%d\n", matrixRows);
        System.out.printf("%d\n", matrixCols);
        System.out.printf("%d\n", sum);
    }
}
