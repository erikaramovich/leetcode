package org.example.easy;

import java.util.Map;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        String reversed = new StringBuilder(s).reverse().toString();
        int total = 0;
        int prev = 0;

        for (char c : reversed.toCharArray()) {
            int current = romanMap.get(c);

            if (current < prev) {
                total -= current;
            } else {
                total += current;
            }

            prev = current;
        }

        return total;
    }
}
