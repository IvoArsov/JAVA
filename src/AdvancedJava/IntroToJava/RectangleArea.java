/*
Write a program that reads the sides of a rectangle (two integers a and b),
calculates and prints the rectangle's area. Format the result to the second digit after the decimal separator.
*/

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int result = a * b;
        float floatResult = (float)result;

        System.out.printf("%.2f", floatResult);
    }
}
