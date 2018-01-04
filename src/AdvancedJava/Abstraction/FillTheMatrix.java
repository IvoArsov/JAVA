/*
Filling a matrix in the regular way (top to bottom and left to right) is boring.
Write two methods that fill a matrix of size N x N in two different patterns.
 */

package AdvancedJava.Abstraction;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] data = input.nextLine().split(", ");

        int matrixSize = Integer.parseInt(data[0]);
        String fillingMethod = data[1];

        int[][] matrix = fillMatrix(matrixSize, fillingMethod);

        printMatrix(matrix);
    }

    private static int[][] fillMatrix(int matrixSize, String fillingMethod){
        int[][] matrix = new int[matrixSize][matrixSize];

        int counter = 1;

        if(fillingMethod.equals("B")){
            for (int i = 0; i < matrixSize; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < matrixSize; j++) {
                        matrix[j][i] = counter++;
                    }
                }else {
                    for (int j = matrixSize - 1; j >= 0; j--) {
                        matrix[j][i] = counter;
                        counter++;
                    }
                }
            }
        }else if(fillingMethod.equals("A")){
            for (int row = 0; row < matrixSize; row++) {
                for (int col = 0; col < matrixSize; col++) {
                    matrix[col][row] = counter++;
                }

            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
