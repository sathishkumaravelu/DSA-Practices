package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class PalindromeNumber {

    @Test
    public void testPalindromeNumber() {
        int num = 101;
        System.out.println(isPalindrome(num));
    }

    private boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }
        int originalNum = num;
        int reversedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return originalNum == reversedNum;
    }
}
