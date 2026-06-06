package org.example.easy;

import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int write = 0;

        for (int read = 0; read < nums.length; read++) {
            // if the current element is not equal to the value, we save it
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return write;
    }
}
