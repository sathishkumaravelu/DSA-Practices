package org.sdet5.twoPointer;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LC283_MoveZero {

    @Test
    public void testMoveZero(){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }

    /*
        1. Keep two pointers left in zero, right in 1
        2. check if the left is zero, right is non zero then swap and increment left and right
        3. if left is non zero and right is non zero then increment left and right
        4. if left is zero, right is zero move the right till find the non zero


     */


    private void moveZeroes(int[] nums) {
        int left = 0, right = 1;

        while(right<nums.length){
            if(nums[left] != 0 && nums[right]!=0){
                right++;
                left++;
            } else if (nums[left]==0 && nums[right]!=0) {
                int temp = nums[left];
                nums[left++]=nums[right];
                nums[right++]=temp;
            }else if(nums[left]==0 && nums[right]==0){
                right++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
