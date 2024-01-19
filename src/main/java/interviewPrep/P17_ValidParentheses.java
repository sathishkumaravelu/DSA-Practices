package interviewPrep;

import org.testng.annotations.Test;

import java.util.Stack;

public class P17_ValidParentheses {
    /*
        input : ()
        input : ()[]{}
        input : (]
        input : {[]}
     */

    @Test
    public void test() {
        boolean validParenthesis = isValidParenthesisCounter("(])[");
        System.out.println(validParenthesis);
    }

    private boolean isValidParenthesisStack(String s) {

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    private boolean isValidParenthesisCounter(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                count++;
            } else if (ch == ')' && count > 0) {
                count--;
            } else if (ch == '}' && count > 0) {
                count--;
            } else if (ch == ']' && count > 0) {
                count--;
            } else {
                return false;
            }
        }
        return count == 0;
    }
}
