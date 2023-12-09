package org.sdet5.SlidingWindow;

import org.testng.annotations.Test;

public class FindTheMaxSumSubArray {

    @Test
    public void testSubArraySum() {
        int[] nums = {1, 5, 2, 3, 7, 1};
        int k = 3;
        findSubArray(nums, k);
    }

    /*
        assign left = 0
        iterate till the k value and start adding the value of the elements
        After, iteration assign it to max value
        start from the k value and iterate till the length of the array
        new subract the inital value and add the value next value
        compare if the current sum is greater than the existing then reassign the max value

     */

    private void findSubArray(int[] nums, int k) {
        int left = 0;
        int maxSum = 0;
        while (left < k) {
            maxSum += nums[left++];
        }
        int sum = maxSum;
        for (int i = left; i <= nums.length - 1; i++) {
            maxSum = maxSum - nums[i - k] + nums[i];
            sum = Math.max(maxSum, sum);
        }
        System.out.println(sum);
    }

}
