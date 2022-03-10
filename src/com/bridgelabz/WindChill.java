package com.bridgelabz;

public class WindChill {

    public static void main(String[] args) {
        // Welcome to the Wind chill program.

        int t;
        int v;
        double a;
        double w;

        System.out.println("The value of v should be within 3 - 120 and value of t should be less than 50. ");
        t = Integer.parseInt(args[0]);
        v = Integer.parseInt(args[1]);
        a = Math.pow(v, 0.16);
        System.out.println("t: " + t);
        System.out.println("v: " + v);
        if (t > 50 || v > 120 || v < 3) {
            System.out.println("Enter the values of t and v within mentioned limits");
        } else {
            w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * a;
            System.out.println("The wind chill is: " + w);
        }
    }
}
