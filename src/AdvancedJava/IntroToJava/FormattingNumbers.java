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
