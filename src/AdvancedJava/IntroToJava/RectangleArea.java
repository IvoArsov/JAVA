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
