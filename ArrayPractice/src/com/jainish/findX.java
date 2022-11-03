package com.jainish;

import java.util.Scanner;

public class findX {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int [] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            // i can use this also "i < size"
            // it will check line by line to find the X value
            if (num[i] == x ){
                System.out.println("Found at the index :" + i);
            }
        }
    }
}