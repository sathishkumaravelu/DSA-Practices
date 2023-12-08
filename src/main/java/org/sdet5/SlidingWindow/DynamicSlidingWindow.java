package org.sdet5.SlidingWindow;

import org.testng.annotations.Test;

public class DynamicSlidingWindow {

    // 1,7,4,3,1,2,1,5,1
    //1,7,4,3,1,2,1,5,1,7

    /*
        Pseudocode:
        •Start with first element
        •If the sum is less than the desired sum, slide to the next element [Grow]
        •Again, sum that and check if it is lesser, equal or greater
        •If it is lesser, add the next element to slide [Grow]
        •If it is greater, than shrink the last element on the left [Shrink]
        •If it is equal, you got it and again do both Grow and Shrink [Slide]

     */


    @Test
    public void testDynamicSlidingWindow(){
        int[] nums ={1,7,4,3,1,2,1,5,1};
        int target = 7;
        findTheSubArray(nums,target);
    }

    private void findTheSubArray(int[] nums, int target) {

        int left = 0, right = 0;
        int sum = nums[left];
        while (left < nums.length) {
            if (sum < target) {
                sum += nums[++right];
            } else if (sum > target) {
                sum = sum - nums[left];
                left++;
            } else {
                printValue(nums, left, right);
                sum += nums[++right];
                if (left <= right) {
                    System.out.print(",");
                }
            }
        }
    }

    private void printValue(int[] nums, int left, int right) {
        while (left<=right){
            System.out.print(nums[left++]+" ");
        }
    }
}
