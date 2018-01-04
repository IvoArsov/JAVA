/*
Print fibonacci numbers by given number
 */

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class FibonacciRow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        int n1 = 0, n2 = 1, n3 = 0;

        for (int i = 0; i <= num; i++) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.println(n3);
        }

    }
}
