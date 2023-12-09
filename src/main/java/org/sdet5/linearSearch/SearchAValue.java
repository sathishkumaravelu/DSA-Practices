package org.sdet5.linearSearch;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchAValue {
    /*
        find a target element in a given array.
     */
    @Test
    public void testFindAValue() {
        int[] nums = {3, 4, 5, 6, 7, 45, 2};
        int target = 7;
        boolean result = isPresent(nums, target);
        Assert.assertTrue(result);
    }

    //Time complexity - O(N) worst case / O(1) best case
    //Space complexity - O(1)
    private boolean isPresent(int[] nums, int target) {

        for (int num : nums) {
            if (num == target) return true;
        }
        return false;
    }
}
