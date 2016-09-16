package com.andrey.string_array;

import java.util.Scanner;

public class FormatStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        String s = str.trim();

        String delims = "[ ,'?!_@.]+";
        if (s.length() >= 1 && s.length() <= 400000) {
            String[] strArray = s.split(delims);
            System.out.println(strArray.length);
            for (int i = 0; i < strArray.length; i++) {
                System.out.println(strArray[i]);
            }
        } else if (s.length() == 0) {
            System.out.println("0");
        }
    }
}
