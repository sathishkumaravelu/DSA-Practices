package org.sdet5.interviewPrep;

import org.testng.annotations.Test;

public class maxHeight {


    @Test
    public void testMaxHightValue(){
        findHighestAltitude(new int[] {-5, 1, 5, 0, -7});
        findHighestAltitude(new int[]{-32, 1, 5, 0, -7});
    }

    private void findHighestAltitude(int[] ints) {

        int max = ints[0], pointer = 1, currentSum = ints[0];

        while (pointer<ints.length){
            currentSum = Math.max(ints[pointer], currentSum + ints[pointer]);
            max = Math.max(currentSum,max);
            pointer++;
        }

        System.out.println(max);
    }
}
