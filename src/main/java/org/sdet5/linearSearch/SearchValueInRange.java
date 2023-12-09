package org.sdet5.linearSearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchValueInRange {

    /*
       find a target element in a given array. from a given range
    */
    @Test
    public void testFindAValue() {
        int[] nums = {3, 4, 5, 6, 7, 45, 2};
        int target = 7;
        int[] range = {3, 2};
        boolean result = isPresent(nums, target, range);
        Assert.assertFalse(result);
    }

    //Time complexity - O(N) worst case / O(1) best case
    //Space complexity - O(1)
    private boolean isPresent(int[] nums, int target, int[] range) {
        for (int i = range[0]; i <= range[1]; i++) {
            if (nums[i] == target) return true;
        }
        return false;
    }
}
