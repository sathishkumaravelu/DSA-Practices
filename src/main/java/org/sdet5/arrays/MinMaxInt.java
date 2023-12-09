package org.sdet5.arrays;

import org.testng.annotations.Test;

public class MinMaxInt {
    @Test
    public void testMinMax() {
        int[] nums = {1, 10, 0, -1, 1, 5, 40};
        findMaxMin(nums);
    }

    //Time Complexity - O(N)
    // Space Complexity - O(1)
    private void findMaxMin(int[] nums) {

        if (nums.length < 1) {
            System.out.println("empty array");
            return;
        } else if (nums.length == 1) {
            System.out.println("min value and max value are: " + nums[0]);
            return;
        }
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("min value and max value are: " + min + " & " + max);
    }
}
