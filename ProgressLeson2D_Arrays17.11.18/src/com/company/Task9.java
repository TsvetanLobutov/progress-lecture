package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        int[][] rotatedArr = new int[n][m];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();

            }

        }

         int rows = arr.length;
         int cols = arr[ 0 ].length;

        for ( int r = 0; r < rows; r++ ) {
            for ( int c = 0; c < cols; c++ ) {
                rotatedArr[ c ][ rows - 1 - r ] = arr[ r ][ c ];
            }
        }

        for (int i = 0; i < rotatedArr.length; i++) {
            for (int x = 0; x < rotatedArr[i].length; x++) {
                System.out.print(rotatedArr[i][x] + " ");
            }
            System.out.println();
        }



    }
}
