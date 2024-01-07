package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class PalindromString {

    @Test
    public void testPalindromeString() {
        String word = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome1(word));
    }

    //Time Complexity - O(N)
    //Space Complexity - O(1)
    private boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome1(String word){
        int left = 0, right = word.length() - 1;
        word = word.toLowerCase();

        while (left < right) {
            char leftChar = word.charAt(left);
            char rightChar = word.charAt(right);

            if (Character.isLetterOrDigit(leftChar) && Character.isLetterOrDigit(rightChar)) {
                if (leftChar != rightChar) {
                    return false;
                }
                left++;
                right--;
            } else {
                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                }
                if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                }
            }
        }
        return true;
    }
}
