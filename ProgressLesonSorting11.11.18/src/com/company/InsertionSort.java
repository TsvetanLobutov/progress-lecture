package com.company;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] arr = {4, 3, 1, 12, 2, 5, 10};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key  =  arr[i];
            int pos = i - 1;
            while (pos >= 0 && arr[pos] > key){
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = key;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }


    }

}
