package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if(arr[i] > 5 && arr[i] % 5 == 0){
                System.out.println(arr[i]);
            }

        }



        }
}
