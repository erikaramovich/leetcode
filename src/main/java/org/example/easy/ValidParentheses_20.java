package org.example.easy;

import java.util.Stack;

public class ValidParentheses_20 {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()[]{)}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(stack.isEmpty())
            {
                stack.push(c);
            }
            else if(c == ']' && stack.peek() == '[')
            {
                stack.pop();
            }
            else if(c == '}' && stack.peek() == '{')
            {
                stack.pop();
            }
            else if(c == ')' && stack.peek() == '(')
            {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
