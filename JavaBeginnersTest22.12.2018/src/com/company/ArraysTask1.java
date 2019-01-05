package com.company;


import java.util.*;

public class ArraysTask1 {
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
                    max = i;
                }
                if(arr[i] < min)
                {
                    min = i;
                }


            }

            int temp = max;
            arr[max] = arr[min];
            arr[min] = temp;


            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }

        }



}
