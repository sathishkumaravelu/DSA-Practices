package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class LC1844_Replace_allDigits {

    @Test
    public void testCheckB() {

        String s = replaceDigits("a1c1e1");
        System.out.println(s);
    }

    private String replaceDigits(String s) {

        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length; i += 2)
            arr[i] += arr[i - 1] - '0';
        return new String(arr);
    }
}
