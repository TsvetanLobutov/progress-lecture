package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            sum = sum + arr[i];
        }

        for (int i = 1; i < sum / 2; i++) {

            if(sum % i == 0 && i % i == 0){
                System.out.println(i + " ");
            }
            
        }
        
    }

}
