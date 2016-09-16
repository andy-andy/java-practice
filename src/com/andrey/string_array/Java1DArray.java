package com.andrey.string_array;

import java.util.Scanner;

public class Java1DArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //Declare array
        int[] intArray = new int[n];

        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            // Fill array
            intArray[i] = val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
