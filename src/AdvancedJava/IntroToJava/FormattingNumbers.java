/*
Write a program that reads 3 numbers:
-an integer a (0 ≤ a ≤ 500)
-a floating-point b
-a floating-point c
Print them in 4 virtual columns on the console, separated with a pipe '|'.
Each column should have a width of 10 characters.
-First, the number a should be printed in hexadecimal, left aligned
-Second, the number a should be printed in binary form, padded with zeroes
-Third, the number b should be printed with 2 digits after the decimal point, right aligned
-Lastly, the number c should be printed with 3 digits after the decimal point, left aligned
You will receive a, b and c on a single line, separated by one or more white spaces.
*/

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputString = input.nextLine().split("\\s+");

        int a = Integer.parseInt(inputString[0]);
        float b = Float.parseFloat(inputString[1]);
        float c = Float.parseFloat(inputString[2]);

        String aHex = Integer.toHexString(a).toUpperCase();
        String aBinary =  String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        if (c % 1 == 0) {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", aHex, aBinary, b, c);
        } else {
            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", aHex, aBinary, b, c);
        }
    }
}
