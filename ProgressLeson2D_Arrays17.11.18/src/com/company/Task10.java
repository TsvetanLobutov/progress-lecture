package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        int evenSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j = j + 2) {

                if(arr[i][j] % 2 != 0){
                    evenSum = evenSum + arr[i][j];
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[i].length; x++) {
                System.out.print(arr[i][x] + " ");
            }
            System.out.println();
        }


        System.out.println(evenSum);


    }
}
