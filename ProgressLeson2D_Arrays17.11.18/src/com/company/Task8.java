package com.company;

import java.util.Scanner;

public class Task8 {
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

        int sumDiagOne = 0;
        int sumDiagTwo = 0;

        for (int row = 0; row < arr.length; row++) {
            sumDiagOne += arr[row][row];
        }

        for (int col = 0; col < n; col++) {
            sumDiagTwo += arr[col][n - 1 - col];
        }

        int sumCol = 0;
        int colNum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

            }
            sumCol = sumCol + arr[i][colNum];
            colNum++;


        }

        int sumRow = 0;
        int rowNum = 0;

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {

            }
            sumRow = sumRow + arr[j][rowNum];
            rowNum++;
        }

        if(sumDiagOne == sumDiagTwo && sumCol == sumRow &&  sumDiagOne == sumRow){
            System.out.println("True");

        }else {
            System.out.println("False");
        }


    }
}
