/*
Create a program that takes two strings as arguments and returns the sum of their character codes multiplied in pairs.
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum, then continue with the next two characters).
If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
 */

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first = input.next();
        String second = input.next();

        Integer minLenght = Math.min(first.length(), second.length());

        long result = 0;
        for (int i = 0; i < minLenght; i++) {
            result += first.charAt(i) * second.charAt(i);
        }

        String longer = "";
        if (first.length() > second.length()) {
            longer = first;
        } else {
            longer = second;
        }
        for (int i = minLenght; i < longer.length(); i++) {
            result += longer.charAt(i);
        }
        System.out.printf("%d", result);
    }
}
