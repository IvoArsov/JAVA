/*
You are given an array of integers as a single line, separated by a space. Write a program that checks consecutive pairs
and prints if both are odd/even or not.
Note that the array length should also be an even number.
 */

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] inputString = input.nextLine().split("\\s+");

        if (inputString.length % 2 == 1){
            System.out.println("invalid length");
        }else{
            for (int i = 0; i < inputString.length - 1; i++) {
                int a = Integer.parseInt(inputString[i]);
                int b = Integer.parseInt(inputString[i++ + 1]);
                if(a % 2 == 0 && b % 2 == 0){
                    System.out.printf("%d, %d -> both are even\n", a, b);
                }else if(a % 2 == 1 && b % 2 == 1){
                    System.out.printf("%d, %d -> both are odd\n", a, b);
                }else{
                    System.out.printf("%d, %d -> different\n", a, b);
                }
            }
        }
    }
}
