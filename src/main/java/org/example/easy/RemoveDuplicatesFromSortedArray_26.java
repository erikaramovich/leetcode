package org.example.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 4, 5}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        int write = 1;

        for (int read = 1; read < nums.length; read++) {
//            System.out.println("Read: " + read + ", Write: " + write);
//            System.out.println(Arrays.toString(nums));
//            System.out.println("Current number: " + nums[read] + ", previous number: " + nums[write-1]);

            // if the current element is not duplicated, we save it
            if (nums[read] != nums[write - 1]) {
//                System.out.println("Copying number to write position");
                nums[write] = nums[read];
                write++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return write;
    }

}
