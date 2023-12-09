package org.sdet5.arrays;

import org.testng.annotations.Test;

public class EvenDigits {

    @Test
    public void testEvenDigit() {
        int[] nums = {12, 345, 2, 6, 7896, 11};
        int noOfEven = getNoOfEven(nums);
        System.out.println(noOfEven);
    }

    private int getNoOfEven(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    private boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    private int digits(int num) {
        // count number of digits in a number
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }

}
