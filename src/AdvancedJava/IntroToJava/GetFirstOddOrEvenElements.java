package AdvancedJava.IntroToJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] digits = input.nextLine().split("\\s+");
        String[] command = input.nextLine().split("\\s+");

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < digits.length; i++) {
            int num = Integer.parseInt(digits[i]);

            if(command[2].equals("odd")){
                if(num % 2 == 1){
                    result.add(num);
                }
            }else if(command[2].equals("even")){
                if(num % 2 == 0){
                    result.add(num);
                }
            }
        }

        StringBuilder toPrint = new StringBuilder();

        for (int i = 0; i < result.size(); i++) {
            if (i < Integer.parseInt(command[1])){
                toPrint.append(result.get(i) + " ");
            }
        }

        System.out.println(toPrint);
    }
}
