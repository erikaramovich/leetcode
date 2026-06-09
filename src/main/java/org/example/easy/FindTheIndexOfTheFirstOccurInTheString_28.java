package org.example.easy;

/**
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 */
public class FindTheIndexOfTheFirstOccurInTheString_28 {
    public static void main(String[] args) {

   /*Example 1:
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.
   */
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = strStr(haystack, needle);
        System.out.println(result);

        /*
    Example 2:
    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.
    */
        haystack = "leetcode";
        needle = "leeto";
        result = strStr(haystack, needle);
        System.out.println(result);


        haystack = "a";
        needle = "a";
        result = strStr(haystack, needle);
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int start = 0; start <= haystack.length() - needle.length(); start++) {
            int j = 0;

            while (j < needle.length() &&
                    haystack.charAt(start + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return start;
            }
        }
        return -1;
        /*
        Or just this one line using the String built-in method
        return haystack.indexOf(needle);
         */
    }

}
