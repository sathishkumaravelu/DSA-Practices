package org.sdet5.hashing;

import org.testng.annotations.Test;

public class LC560 {

    @Test
    public void testSubarraySumEqualsK() {
        int[] nums = {2, 0, 1, 1};
        int k = 2;
        subarraySum(nums, k);
    }

    private void subarraySum(int[] nums, int k) {
        int left = 0, right = 0, sum = nums[left];
        int count = 0;
        while (left < nums.length && right < nums.length) {
            if (sum == k) {
                count++;
                left++;
                right = left;
            } else if (sum < k) {
                right++;
                sum += nums[right];
            } else {
                left++;
            }
        }

        System.out.println(count);
    }


}
