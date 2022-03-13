package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void quadratic() {
        float delta;
        float root1;
        float root2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();
        System.out.println("The equation is: " + a + "x^2" + "+" + b + "x" + "+" + c);

        delta = ((b * b) - 4 * a * c);
        System.out.println("delta= " + delta);
        root1 = (float)((-b + Math.sqrt(delta)) / 2 * a);
        root2 = (float)((-b - Math.sqrt(delta)) / 2 * a);
        if (delta > 0) {
            System.out.println("Roots are real and distinct");
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else if (delta == 0) {
            System.out.println("Roots are real abd equal");
            System.out.println("Roots are: " + root1 + " and " + root2);
        } else {
            System.out.println("Roots are not real");
        }
    }

    public static void main(String[] args) {
        quadratic();
    }
}
