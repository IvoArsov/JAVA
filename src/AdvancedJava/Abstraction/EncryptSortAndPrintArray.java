/*
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
-The code of each vowel multiplied by the string length
-The code of each consonant divided by the string length
Sort the number sequence alphabetically and print it on the console.
On first line, you will always receive the number of strings you have to read.
*/

package AdvancedJava.Abstraction;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = Integer.parseInt(input.nextLine());
        String[] names = new String[lines];

        for (int i = 0; i < lines; i++) {
            names[i] = input.nextLine();
        }

        for (int i = 0; i < names.length; i++) {
            encrypt(names[i]);

        }
    }

    static void encrypt(String names){
        int result = 0;

        char[] namesAsChar = names.toCharArray();
        Arrays.sort(namesAsChar);
        for (int j = 0; j < namesAsChar.length; j++) {
            boolean vowelOrNot = findVowelOrNot(namesAsChar[j]);
            if(vowelOrNot){
               result += namesAsChar[j] * namesAsChar.length;
            }else {
                result += namesAsChar[j] / namesAsChar.length;
            }
         }

        System.out.println(result);

    }

    static boolean findVowelOrNot(char ch){
        boolean result = false;

        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            result = true;
        }

        return result;
    }
}
