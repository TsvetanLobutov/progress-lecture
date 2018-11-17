package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        int[] arr = new int[n];
        ArrayList<Integer> arr2 = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();

        for (int i = 0; i < n; i++) {

            if(arr[i] != m){
                arr2.add(arr[i]);

            }

            }

            System.out.println(arr2);


    }
}
