package org.sdet5.stack;

import org.testng.annotations.Test;

import java.util.Stack;

public class ValidParentheses {

    @Test
    public void testValidParantheses(){
        boolean valid = isValid("({)}");
        System.out.println(valid);
    }

    //Time complexity - O(N)
    //Space complexity - O(N)
    private boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if(c=='('){
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            }else if (c == '[') {
                stack.push(']');
            }else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
