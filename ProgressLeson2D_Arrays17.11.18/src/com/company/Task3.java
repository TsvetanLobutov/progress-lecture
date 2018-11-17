package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();

            }

        }

        int maxinRow = 0;
        int maxinCol = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (maxinRow < arr[i][j]){
                    maxinRow = arr [i][j];
                }


            }
            System.out.println(maxinRow);
             maxinRow = 0;
        }

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                if (maxinCol < arr[i][j]){
                    maxinCol = arr [i][j];
                }


            }
            System.out.println(maxinCol);
            maxinCol = 0;
        }






    }
}
