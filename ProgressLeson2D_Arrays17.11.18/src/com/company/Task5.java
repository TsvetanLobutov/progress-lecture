package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();


        int[][] arr = new int[n][n];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
                arr[i][j] = arr[i][j] * sum;

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                System.out.print(arr[i][x] + " ");
            }
            System.out.println();
        }






    }
}
