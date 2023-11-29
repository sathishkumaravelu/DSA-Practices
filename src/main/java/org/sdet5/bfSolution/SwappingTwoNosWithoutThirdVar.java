package org.sdet5.bfSolution;

import org.testng.annotations.Test;

public class SwappingTwoNosWithoutThirdVar {

    @Test
    public void testSwapWithoutThirdVariable(){
        swapTwoVariable(10,15);
    }

    private void swapTwoVariable(int x, int y) {
        System.out.println("Before Swapping");
        System.out.println("value of x : "+x +" & "+"value of y: "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After Swapping");
        System.out.println("value of x : "+x +" & "+"value of y: "+y);
    }
}
