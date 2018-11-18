package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int m = in.nextInt();

        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        // int[][] sum = new int[n][n];


        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = in.nextInt();

            }

        }

        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                m2[i][j] = in.nextInt();

            }

        }

        System.out.println( addMatrix( m1,m2,n));



        



    }

    public static int[][] addMatrix(int[][] m1, int[][] m2, int n){

         int[][] sum = new int[n][n];

        for (int x = 0; x < m1.length; x++) {
            for (int y = 0; y < m1[0].length; y++) {
                sum[x][y] = m1[x][y] + m2[x][y];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int x = 0; x < sum[i].length; x++) {
                System.out.print(sum[i][x] + " ");
            }
            System.out.println();
        }

        return sum;

    }

}
