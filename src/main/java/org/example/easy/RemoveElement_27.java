package org.example.easy;

import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int occurence = 0;
        int end = nums.length - 1;


        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            if(nums[i] == val )
            {
                occurence++;
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        System.out.println(Arrays.toString(nums));
        return occurence;
        }
    }
