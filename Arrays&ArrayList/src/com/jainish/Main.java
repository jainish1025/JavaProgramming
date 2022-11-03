package com.jainish;

public class Main {
    public static void main(String[] args) {
       //If i want to store 10 rollno then i dont use 5 variable to store. so i want to use Array

        //Systax of array
        // datatype[] variable_name = new datatype[size];
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        for (int i = 0; i < 5 ; i++) {
            System.out.println(numbers[i]);
        }

        // I can use this also directly assign values

        System.out.println("This is directly assign the values: ");

        int[] num = {12,43,54,65,33};

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }

        // Breakdown

        int [] rono; // Declaration of array, ros is getting  defined in the (stack memory)
        rono = new int[5]; // initialisation:  Actually here object is being created in the memory (heap memory)

        // if i don't initialize the value it will print default value for all datatype
        System.out.println(rono[1]);

        // String array
        String [] names = new String[5];
        System.out.print(names[1]);

    }
}
