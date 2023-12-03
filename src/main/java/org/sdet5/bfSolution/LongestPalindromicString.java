package org.sdet5.bfSolution;

import org.testng.annotations.Test;

public class LongestPalindromicString {

    @Test
    public void testLongestPalindromicString(){

        String str = "babad";
        String s = longestPalindromicString(str);
        System.out.println(s);
    }

    //Time complexity - O(N * N)
    //Space Complexity - O(N)
    private String longestPalindromicString(String str) {

        if(str.isEmpty()){
            return "";
        }
        String longestPalindromString = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String subString = str.substring(i,j);
                if(isPalindrom(subString) && subString.length()>longestPalindromString.length()){
                    longestPalindromString = subString;
                }
            }
        }
        return longestPalindromString;
    }

    private boolean isPalindrom(String subString) {
        int left = 0, right = subString.length()-1;
        while (left<right){
            if(subString.charAt(left)!= subString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
