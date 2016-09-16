package com.andrey.string_array;

import java.util.Scanner;

public class IntegerToString {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            String s = String.valueOf(n);
        } catch(Exception e) {
            System.out.println("Problem: " + e);
        }
    }
}
