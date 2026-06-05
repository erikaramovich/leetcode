package org.example.easy;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
//                System.out.println(i + " strs[i]: " + strs[i] + ", strs[i].indexOf(prefix): " + strs[i].indexOf(prefix));
                prefix = prefix.substring(0, prefix.length() - 1);
//                System.out.println("prefix: " + prefix);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
