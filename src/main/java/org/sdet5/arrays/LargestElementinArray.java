package org.sdet5.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LargestElementinArray {

    /*
        input  - int array
        output - int
     */
    @Test
    public void positiveData() {
        int[] input = {1, 2, 10, 1, 41, 1};
        Assert.assertEquals(findLargeValue(input), 41);
    }

    @Test
    public void edgeData() {
        int[] input = {1, 2, 10, 1, -41, -1};
        Assert.assertEquals(findLargeValue(input), 10);
    }

    @Test
    public void edgeData1() {
        int[] input = {};
        Assert.assertEquals(findLargeValue(input), Integer.MIN_VALUE);
    }

    @Test
    public void negativeData() {
        int[] input = {-41, -1};
        Assert.assertEquals(findLargeValue(input), -1);
    }

    /*
        Pseudo Code:
        1. Initalize the result variable with Integer.Min
        2. Iterate through the given array
            check if the value is greater than result then replace with it
        3. return result
     */

    public int findLargeValue(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int num : nums) if (num > result) result = num;
        return result;
    }
}
