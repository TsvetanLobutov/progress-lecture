package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        int[][] trasposedMatrix = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();

            }

        }

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < m; y++) {
                trasposedMatrix[x][y] = arr[y][x];
            }
        }

        for (int i = 0; i < trasposedMatrix.length; i++) {
            for (int x = 0; x < trasposedMatrix[i].length; x++) {
                System.out.print(trasposedMatrix[i][x] + " ");
            }
            System.out.println();
        }


    }
}
