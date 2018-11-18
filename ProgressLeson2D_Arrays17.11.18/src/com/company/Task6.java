package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int[][] firstArray = new int[n][m];
        int[][] secondArray = new int[a][b];
        int[][] result = new int[firstArray.length][secondArray[0].length];


        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = in.nextInt();

            }

        }

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                secondArray[i][j] = in.nextInt();

            }

        }

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray[0].length; j++) {
                for (int k = 0; k < firstArray[0].length; k++) {
                    result[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }


        for (int i = 0; i < result.length; i++) {
            for (int x = 0; x < result[i].length; x++) {
                System.out.print(result[i][x] + " ");
            }
            System.out.println();
        }




    }

}
