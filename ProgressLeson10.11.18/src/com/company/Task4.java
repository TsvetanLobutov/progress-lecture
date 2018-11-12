package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        boolean sym = true;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int i = 0;i < n;i++){
            if(arr[i]!= arr[n-1-i]){
                sym=false;}
        }

        if(sym==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }




    }
}
