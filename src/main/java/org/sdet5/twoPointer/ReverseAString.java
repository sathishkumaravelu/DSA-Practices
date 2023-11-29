package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class ReverseAString {
    /*
    1️⃣ String Reverse: Write a method that takes a string as an argument and returns its reverse version.
     */

    @Test
    public void testReverseString(){
        String word ="Hello Word!2";
        reverseString(word);
    }

    //Time Complexity - O(N)
    //Space Complexity -O(N)
    private void reverseString(String word) {
        char[] charArray = word.toCharArray();
        int left = 0, right = word.length()-1;
        while(left<right){
            char temp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = temp;
        }
        System.out.println(new String(charArray));
    }
}
