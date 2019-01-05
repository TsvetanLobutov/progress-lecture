package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int[] arr = new int[n];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int count = 0;
        int occur = 0;
        int high = 0;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
                if (count > occur) {
                    occur = count;
                    high = arr[i];
                }
            } else {
                count = 0;
            }


        }

        System.out.println(high);



    }

}
