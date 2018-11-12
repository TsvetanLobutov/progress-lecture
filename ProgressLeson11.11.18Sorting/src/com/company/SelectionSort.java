package com.company;


import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = {4, 3, 1, 12, 2, 5, 10};


        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int minindex = i;
            for (int j = i; j < n ; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    minindex = j;
                }
                int temp = arr[j];
                arr[j] = min;
                arr[minindex] = temp;

            }
        }


    }





}
