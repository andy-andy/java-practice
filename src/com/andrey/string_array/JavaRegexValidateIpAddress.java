package com.andrey.string_array;

import java.util.Scanner;

/**
 * Write a class called myRegex which will contain a string pattern.
 * You need to write a regular expression and assign it to the pattern
 * such that it can be used to validate an IP address.
 * IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
 * Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 */
public class JavaRegexValidateIpAddress {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

    }

    static class myRegex {
        String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        public String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    }
}