package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if(arr[i] % 2 == 0){
                arr[i] = 0;
            }

        }
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");

        }



    }
}
