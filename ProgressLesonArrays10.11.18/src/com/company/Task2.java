package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        int max = 0;
        int min = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }


        }

        System.out.println(max);
        System.out.println(min);
    }

}
