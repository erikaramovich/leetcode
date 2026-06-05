package org.example.easy;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;

        int counter = 0;
        for (int digit : digits) {
            if (digit == 9) {
                counter++;
            }
        }

        if (counter == len) {
            int[] result = new int[len + 1];
            result[0] = 1;
            return result;
        }

        int i = 0;
        while (digits[len - i - 1] == 9) {
            digits[len - i - 1] = 0;
            i++;
        }

        digits[len - i - 1] = digits[len - i - 1] + 1;
        return digits;
    }
}
