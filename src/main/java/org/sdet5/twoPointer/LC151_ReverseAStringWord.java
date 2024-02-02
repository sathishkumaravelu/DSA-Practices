package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class LC151_ReverseAStringWord {


    @Test
    public void test(){
        String str = "a good   example";
        reverseWords(str);
    }

    public String reverseWords(String str){
        String[] s = str.split("\\s+");
        int left = 0, right = s.length-1;
        while (left<right){
            String temp = s[right];
            s[right--] = s[left];
            s[left++] = temp;
        }
        String result ="";
        for (String temp: s) {
            result += temp+" ";
        }
        result = result.trim();
        System.out.println(result);
        return result;
    }
}
