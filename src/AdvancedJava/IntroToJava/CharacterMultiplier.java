package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputArr = input.nextLine().split("\\s+");

        String str1 = inputArr[0];
        String str2 = inputArr[1];

        byte[] bytesStr1 = str1.getBytes();
        byte[] bytesStr2 = str2.getBytes();

        int result = 1;
        int digitFrom1;
        int digitFrom2;

        for (int i = 0; i < bytesStr1.length; i++) {
            digitFrom1 = bytesStr1[i];
        }

        for (int j = 0; j < bytesStr2.length; j++) {
            digitFrom2 = bytesStr2[j];
        }

        //TODO: Unfinished
    }
}
