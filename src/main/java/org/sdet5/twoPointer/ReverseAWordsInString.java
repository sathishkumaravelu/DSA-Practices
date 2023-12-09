package org.sdet5.twoPointer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class ReverseAWordsInString {

    @Test
    public void testReverseWordString() {
        //  String words = "I am Happy engineer";
        String words = "babu, I am Happy engineer";
        reversStringInSpace(words);
    }

    private void generateReverseWords(String words) {
        String[] split = words.split("\\s+");
        for (int i = 0; i < split.length; i++) {
            split[i] = revereString(split[i]);
        }
        System.out.println(Arrays.toString(split));
    }

    private String revereString(String s) {

        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;
            right--;
            left++;
        }

        return new String(charArray);
    }


    /*
        iterate my right pointer to length of the char array
        if i found a space then im reversing the char-array from the left pointer to right pointer
        then moving my left next to the right ( space ) again checking for the next space
        finally returning the array
     */
    private String reversStringInSpace(String s) {
        int left = 0;
        char[] charArray = s.toCharArray();
        for (int right = 0; right < charArray.length; right++) {
            if (Character.isWhitespace(charArray[right])) {
                reverseCharArray(charArray, left, right - 1);
                left = right + 1;
            }
        }

        System.out.println(new String(charArray));
        return Arrays.toString(charArray);
    }

    private void reverseCharArray(char[] charArray, int left, int right) {
        while (left < right) {
            char temp = charArray[right];
            charArray[right] = charArray[left];
            charArray[left] = temp;
            right--;
            left++;
        }
    }


}
