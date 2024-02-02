package org.sdet5.twoPointer;


import org.testng.annotations.Test;

public class LC345_ReverseVowelsOfAString {

    /*
        Given a string s, reverse only all the vowels in the string and return it.
        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
        and upper cases, more than once.
     */
    @Test
    public void test() {
        reverseVowels("leetcode");
    }

    /*
        1. convert the string into a charArray and store it a char array
        2. have two pointer, left = 0, right = charArray.length
        3. iterate till the left pointer cross the right
        4. if the left or right pointer has vowels increment or decrement respectively
        5. if the left pointer and right pointer has vowels swap and repeat
     */
    private void reverseVowels(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            // Check if the characters at left and right are vowels
            boolean isLeftVowel = isVowel(charArray[left]);
            boolean isRightVowel = isVowel(charArray[right]);

            if (isLeftVowel && isRightVowel) {
                // Swap the vowels if both are vowels
                char temp = charArray[left];
                charArray[left++] = charArray[right];
                charArray[right--] = temp;
            } else if (!isLeftVowel) {
                left++;
            } else if (!isRightVowel) {
                right--;
            }
        }

        System.out.println(new String(charArray));
    }

    private boolean isVowel(char c) {
        // Check if the character is a vowel (both uppercase and lowercase)
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}

