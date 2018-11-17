package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Integer[] numbers = new Integer[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

       ;


        System.out.println("Original numbers: " +
                Arrays.toString(numbers));

        int m = in.nextInt();
        int pos = in.nextInt();

        // Creates an ArrayList object and add the entire content of numbers
        // array into the list. We use the add(index, element) method to add
        // element = 5 at index = 3.
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(numbers));
        list.add(pos, m);

        // Converts back the list into array object and prints the new values.
        numbers = list.toArray(new Integer[list.size()]);
        System.out.println("After insert    : " + Arrays.toString(numbers));




        }

    }




