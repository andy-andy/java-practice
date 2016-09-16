package com.andrey.string_array;

public class ReverseWordsInTheString {

    public static void main(String[] args) {
        String str = "the sky is blue";

        String[] stringArray = str.split(" ");

        StringBuilder newString = new StringBuilder();

        for (int i = stringArray.length - 1; i >= 0; i--) {
            newString.append(stringArray[i] + " ");
        }
        System.out.println(newString.toString());
    }
}
