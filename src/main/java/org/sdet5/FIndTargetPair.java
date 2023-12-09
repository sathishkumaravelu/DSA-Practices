package org.sdet5;

public class FIndTargetPair {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6, left = 0, right = left + 1;
        while (left <= nums.length) {
            if (nums[left] + nums[right] == target) {
                System.out.println(nums[left] + "," + nums[right]);
                left++;
                right = left;
            } else if (right == nums.length - 1) {
                left++;
                right = left;
            } else {
                right++;
            }
        }
        System.out.println("value not found");
    }
}
