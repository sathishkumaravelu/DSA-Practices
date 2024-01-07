package org.sdet5.twoPointer;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class TripleSum {

    @Test
    public void test(){
        findTripleSum(new int[] {-1,0,1,2,-1,-4});
    }

    private void findTripleSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


    }


}
