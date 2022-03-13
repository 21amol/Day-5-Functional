package com.bridgelabz;

import java.util.Scanner;

public class TwoDimArray {
    public static void twoDimArray(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();

        int[][] array = new int[rows][col];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " +array[i][j]);
            }
        }
    }
    public static void main(String[] args) {
    twoDimArray();
    }
}
