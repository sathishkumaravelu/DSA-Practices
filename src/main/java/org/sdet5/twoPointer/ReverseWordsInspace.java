package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class ReverseWordsInspace {

    @Test
    public void testReverWord() {

        String word = "Hi Hellow world!, welcome everyone.";
        reverseWordsInSpace(word);
    }

    //Time Complexity - O(N)
    //Space Complexity -O(1)
    private void reverseWordsInSpace(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        for (int i = 0; i <= charArray.length; i++) {
            if (i == charArray.length || charArray[i] == ' ') {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
        }
        System.out.println(new String(charArray));
    }

    private void reverse(char[] charArray, int left, int right) {
        while (left < right) {
            char temp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = temp;
        }
    }
}
