package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class LC1768_MergeStrings {

    @Test
    public void  test(){
        String s = mergeString("abcd", "pq");
        System.out.println(s);
    }

    /*
        1. check if the string is not empty on both s and t, if any one of it is empty
        return the other.
        2. assign left and right == 0
        3. iterate till left or right pointer reaches the respective string length
        4. start appending left character and right character
        5. once iteration is over, check if the left string or right string length is higher
            get the substring and append
        6. finally return the output string
     */



    private String mergeString(String s, String t) {

        if(s.isEmpty() && !t.isEmpty()) return t;
        if(!s.isEmpty() && t.isEmpty()) return s;
        if(s.isEmpty() && t.isEmpty()) return "";

        int left = 0, right = 0;
        StringBuffer output = new StringBuffer();
        while(left<s.length() && right <t.length()){
            output.append(s.charAt(left++)).append(t.charAt(right++));
        }

        if(left<s.length()){
            output.append(s, left, s.length());
        }
        if(right<t.length()){
            output.append(t, left, t.length());
        }
        return output.toString();
    }
}
