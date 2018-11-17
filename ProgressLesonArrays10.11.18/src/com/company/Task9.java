package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];



        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(findGCD(arr, n));


    }

    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers

    static int findGCD(int arr[], int n) {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }
}
