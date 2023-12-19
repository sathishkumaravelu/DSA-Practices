package org.sdet5.characterASCIIProblem;

import org.testng.annotations.Test;

public class StringValueCalculation {

    @Test
    public void testValueCalcuation(){
        String str = "abc";
        int result = calculateValue(str);
        System.out.println(result);
    }

    private int calculateValue(String str) {

        int result = 0;
        for (char ch: str.toCharArray()) {
            int temp = ch - 'a' + 1;
            result+=temp;
        }

        return result;
    }
}
