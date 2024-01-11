package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class LC58_LengthOfLastWord {

    @Test
    public void testFindLastWordLength(){
        String s = "a";
        int lastWordLength = findLastWordLength(s);
        System.out.println(lastWordLength);
    }

    /*
        1. keep a pointer left to length-1 of the string
        2. iterate till right reaches the zero
            if maxLength  is zero and charAt(right) == ' ' the increment the right pointer alone
        3. increment the maxlength till it find the ' ', if it find return the maxLength
        4. finally if the right pointer reaches the zero return maxLength


     */

    private int findLastWordLength(String s) {
        int right = s.length()-1, maxLength = 0;
        while(right>0){
            char ch = s.charAt(right);
            if(maxLength==0 && ch==' '){
                right--;
            }else if(ch!=' '){
                right--;
                maxLength++;
            } else {
                return maxLength;
            }
        }
        return  maxLength;
    }
}
