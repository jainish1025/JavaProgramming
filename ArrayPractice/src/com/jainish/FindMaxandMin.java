package com.jainish;

import java.util.Scanner;

public class FindMaxandMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num = new int[size];

        for (int i = 0; i < size; i++){
            num[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length ; i++) {
            if (num[i] > max){
                max = num[i];
            }
            if (num[i] < min){
                min = num[i];
            }
        }

        System.out.println("Your max value is :" + max);
        System.out.println("Your min value is :" + min);

    }
}
