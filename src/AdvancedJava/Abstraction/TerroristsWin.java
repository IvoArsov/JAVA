/*
On de_dust2 terrorists have planted a bomb (or possibly several of them)! Write a program that sets those bombs off!
A bomb is a string in the format |...|. When set off, the bomb destroys all characters inside.
The bomb should also destroy n characters to the left and right of the bomb.
n is determined by the bomb power (the last digit of the ASCII sum of the characters inside the bomb).
Destroyed characters should be replaced by '.' (dot).
 */

package AdvancedJava.Abstraction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TerroristsWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String field = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\|(?<bomb>.*?)\\|");
        Matcher matcher = pattern.matcher(field);
        while (matcher.find()) {
            String bomb = matcher.group("bomb");
            int bombPower = 0;
            for (int i = 0; i < bomb.length(); i++) {
                bombPower += bomb.charAt(i);
            }
            bombPower %= 10;
            Pattern pattern2 = Pattern.compile(".{0," + bombPower + "}\\|.*?\\|.{0," + bombPower + "}");
            Matcher matcher2 = pattern2.matcher(field);
            matcher2.find();
            int affectedChars = matcher2.group().length();
            String bombRemovalRegex = ".{0," + bombPower + "}\\|.*?\\|.{0," + bombPower + "}";
            field = field.replaceFirst(bombRemovalRegex, new String(new char[affectedChars]).replace('\0', '.'));
        }
        System.out.println(field);
    }
}
