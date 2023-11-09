package org.sdet5.twoPointer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC011_Container_With_Most_Water {
    /*
        1. https://leetcode.com/problems/container-with-most-water/description/
     */
    /*
        Input - int num array
        output - int
    */
    @Test
    public void positiveData() {
        int[] input = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(49,maxArea(input));
    }
    @Test
    public void edgeData() {
        int[] input = {5, 1, 3, 6, 7, 7, 6, 3, 1, 5};
        Assert.assertEquals(input,maxArea(input));
    }

    @Test
    public void edgeData1() {
        int[] input = {1, 2, 1};
        Assert.assertEquals(input,maxArea(input));
    }

    /*
        Pseudo Code:
        1. Initialize two pointer left to zero and right to length-1
        2. Initialize a result variable to integer.Min Value
        3. Iterate till when left and right cross
                - find the area by min height and length between the right pointer
                - check if the area is max than result, then assign the area to result
        4. return the result
     */


    //Time complexity - O(N)
    //Space complexity - O(N)
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int result = Integer.MIN_VALUE;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(area, result);
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }
        return result;
    }
}
