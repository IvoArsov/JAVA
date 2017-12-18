/*
Write a program that takes as input an integer – the target – and outputs to the console
all pairs of numbers between 1 and 20, which, if added or subtracted, result in the target.
 */

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = Integer.parseInt(input.nextLine());

        int[] numberRange = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 0; i < numberRange.length; i++) {
            for (int j = 0; j < numberRange.length; j++) {
                if(numberRange[i] + numberRange[j] == target){
                    System.out.printf("%d + %d = %d\n", numberRange[i], numberRange[j], target);
                }else if(numberRange[i] - numberRange[j] == target){
                    System.out.printf("%d - %d = %d\n", numberRange[i], numberRange[j], target);
                }
            }
        }
    }
}
