/*
Write a program that reads 3 points in the plane (with integer x and y as coordinates),
calculates and prints the area of the triangle composed by these 3 points. Round the result to a whole number.
In case the three points do not form a triangle, print "0" as result.
*/

package AdvancedJava.IntroToJava;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] triangle = new String[3];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = input.nextLine();
        }

        String[] a = triangle[0].split(" ");
        String[] b = triangle[1].split(" ");
        String[] c = triangle[2].split(" ");

        int aX = Integer.parseInt(a[0]);
        int aY = Integer.parseInt(a[1]);

        int bX = Integer.parseInt(b[0]);
        int bY = Integer.parseInt(b[1]);

        int cX = Integer.parseInt(c[0]);
        int cY = Integer.parseInt(c[1]);

        int triangleArea = Math.abs(((aX*(bY - cY)) + (bX*(cY - aY)) + (cX*(aY - bY))) / 2);

        System.out.println(triangleArea);
    }
}
