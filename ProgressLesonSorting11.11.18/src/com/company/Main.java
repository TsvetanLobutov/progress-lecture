package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int j = n - 1 ; j >= 0 ; j--) {
            for (int i = 0; i < j; i++) {

                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }




        }


    }
}
