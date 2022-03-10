package com.bridgelabz;

public class Distance {

    public static void main(String[] args) {
        // Welcome to Calculating the Distance Program.
        // Calculating distance from origin.
        int x;
        int y;
        double distance;
        x = Integer.parseInt(args[0]);      // using command line arguments.
        y = Integer.parseInt(args[1]);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance between origin and (x,y) is: " + distance);
    }
}
