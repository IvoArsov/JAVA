/*
Create a method that calculates a triangle area by a given:
-Base
-Height
Return the area as an output of the program. Format the result to the second digit after the decimal separator.
*/


package AdvancedJava.Abstraction;

import java.util.Scanner;

public class CalculateTriangleAreaMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputData = input.nextLine().split(" ");
        double base = Double.parseDouble(inputData[0]);
        double height = Double.parseDouble(inputData[1]);

        triangleArea(base,height);
    }

     static void triangleArea(double base, double height){

        double result = 0.5*(base * height);
        System.out.printf("Area = %.2f", result);
    }
}
