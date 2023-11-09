package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;

public class LC001_TwoSum {

    /*
        input - int array
        output - int array

     */

    @Test
    public void positiveData() {
        int[] input = {1, 1, 2, 0, 1};
        int target = 1;
        Arrays.equals(findTwoSum(input, target), new int[]{3, 4});
    }

    @Test
    public void negativeData() {
        int[] input = {1, 1, 2, 0, 1};
        int target = 10;
        Arrays.equals(findTwoSum(input, target), new int[]{0, 0});
    }

    @Test
    public void edgeData() {
        int[] input = {1, 1, 1, 1, 1};
        int target = 2;
        Arrays.equals(findTwoSum(input, target), new int[]{0, 1});
    }

    /*
        Pseudo Code:
        1. create a hashmap
        2. Iterate through the given input
                get the difference between the target and value at index i
                check if the difference is already available in the map, then
                return  get the index stored in map already and index
                add the value and index to the map in key and value respectively
     */

    /*
        Time Complexity:
        Average Case: O(n)
        Worst Case: O(n)
        Space Complexity - O(n)
     */
    public int[] findTwoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return result;
    }
}