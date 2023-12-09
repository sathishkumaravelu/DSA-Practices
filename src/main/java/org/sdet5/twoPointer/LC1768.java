package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class LC1768 {

    @Test
    public void testMergeString() {
        String word1 = "abc";
        String word2 = "qpr";
        String s = mergeString(word1, word2);
        System.out.println(s);
    }
    /*
        1. keep two pointer left and right to zero
        2. convert the string intro char array
        3. Iterate till the left or right pointer reaches the length
            add the value of left and right
        4. once left pointer reaches the length or right reaches the length
            iterate to the end then add it to the string

     */

    private String mergeString(String word1, String word2) {
        int left = 0, right = 0;
        String str = "";
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        while (left < word1.length() && right < word2.length()) {
            str = str + word1Array[left] + word2Array[right];
            left++;
            right++;
        }

        while (right < word1.length()) {
            str = str + word1Array[right];
            right++;
        }

        while (left < word2.length()) {
            str = str + word2Array[left];
            left++;
        }
        return str;
    }
}
