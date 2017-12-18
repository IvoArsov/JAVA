/*
Write a program that reads three floating point numbers a, b, and c from the console and calculates the following expressions:
"f1 = ((a2 + b2) / (a2 – b2))(a + b + c) / √c"  "f2 = (a2 + b2 - c3)(a – b)"
Then the program calculates the absolute value of the difference between the average of the three numbers and the average
of the two expressions.
"Abs (Avg (a, b, c) – Avg (f1, f2))"
You will receive a, b and c on a single line, separated by one or more white spaces.
*/

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputString = input.nextLine().split("\\s+");
        float a = Float.parseFloat(inputString[0]);
        float b = Float.parseFloat(inputString[1]);
        float c = Float.parseFloat(inputString[2]);

        double f1 = Math.pow(((Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2))), ((a + b + c)/ Math.sqrt(c)));
        double f2 = Math.pow((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3)), (a - b));

        double diff = Math.abs(((a + b + c) / 3) - ((f1 + f2) / 2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);

    }
}
