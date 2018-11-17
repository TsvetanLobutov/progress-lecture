package com.company;

import java.util.Scanner;

public class Task2 {

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

        int sumOne = 0;
        int sumTwo = 0;

        for (int row = 0; row < arr.length; row++) {
            sumOne += arr[row][row];
        }

        for (int col = 0; col < n; col++) {
            sumTwo += arr[col][n - 1 - col];
        }

//        System.out.println(sumTwo);
//
//        System.out.println(sumOne);

        if(sumOne > sumTwo){
            System.out.println(sumOne + " is greater");
        }else{
            System.out.println(sumTwo + " is greater");
        }



    }


}
