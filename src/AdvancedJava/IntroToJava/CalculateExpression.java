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
