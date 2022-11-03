package com.jainish;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // already define the value
//        arr[0] = 23;
//        arr[1] = 13;
//        arr[2] = 53;
//        arr[3] = 83;
//        arr[4] = 73;

        //Taking input using for loop
        for (int i = 0; i < size ; i++) {
            // taking input from the user
            arr[i] = sc.nextInt();
        }

        // output of the array
        for (int i = 0; i < arr.length ; i++) {
            System.out.println( arr[i]);
        }

    }
}
