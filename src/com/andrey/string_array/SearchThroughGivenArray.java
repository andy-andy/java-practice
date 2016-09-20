package com.andrey.string_array;

public class SearchThroughGivenArray {

    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        System.out.println(search(intArr, target));
    }

    // Search
    // Searches through the given array looking
    // for the given target. Returns the index number
    // of the target if found, or -1 otherwise.
    // (classic search-loop example)
    public static int search(int[] nums, int target) {
        // Look at every element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // return the index where the target is found
            }
        }
        // If we get here, the target was not in the array
        return -1;
    }
}
