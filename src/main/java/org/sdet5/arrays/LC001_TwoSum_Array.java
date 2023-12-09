package org.sdet5.arrays;

import org.testng.annotations.Test;

import java.util.Arrays;

public class LC001_TwoSum_Array {

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
        1. iterate through the enter loop, from zero
        2.      iterate from the zero+1 element add the value and check if it equals to target
                add the i and j value in the result array and return
        3. return the output result array
     */

    public int[] findTwoSum(int[] input, int target) {
        int[] result = new int[2];
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == target) {
                    result[0] = input[i];
                    result[1] = input[j];
                    break;
                }
            }
        }
        return result;
    }
}