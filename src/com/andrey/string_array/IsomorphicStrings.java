package com.andrey.string_array;

import java.util.LinkedList;

public class IsomorphicStrings {

    public static void main(String[] args) {
        // write your code here
        String str1 = "bbbb";
        String str2 = "xbzz";

        LinkedList l1 = countChars(str1);
        LinkedList l2 = countChars(str2);

        if (l1.equals(l2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static LinkedList countChars(String str) {
        LinkedList<Integer> intList = new LinkedList<>();
        char currentChar = str.charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                currentChar = str.charAt(i);
                intList.add(count);
                count = 1;
            }
        }
        intList.add(count);
        return intList;
    }
}
