package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class PalindromString {

    @Test
    public void testPalindromeString(){
        String word = "level ";
        System.out.println(isPalindrome(word));
    }

    //Time Complexity - O(N)
    //Space Complexity - O(1)
    private boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length()-1;
        while (left<right){
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
