package com.company;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] arr = {4, 3, 1, 12, 2, 5, 10};
        int n = arr.length;
        System.out.println(binarySearch(arr, 44,));
    }

    int binarySearch(int[] arr, int target,int left, int right){

         left = 0;
         right = arr.length;
        int start = (right - left) / 2;

        if(arr[start] < target){
            left = start;
            binarySearch(arr,target,left,right);
                    if(arr[start] == target)
                        return start;
        }

    }


}
