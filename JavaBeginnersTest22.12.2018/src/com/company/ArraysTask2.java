package com.company;

import java.util.Scanner;

public class ArraysTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;

        int[] arr = new int[n];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = scanner.nextInt();
        }

        System.out.println(symmHelper(arr, n, i));


    }

    private static boolean symmHelper(int[] A, int n, int i) {

        if (i > n/2)
            return true;

        else if (A[i] != A[n-1-i])
            return false;

        else
            return symmHelper(A, n, i+1);
    }
}
