package org.sdet5.twoPointer;

import org.testng.annotations.Test;

public class BuySell2 {

    @Test
    public void test() {
        maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        maxProfit(new int[]{1,2,3,4,5});
    }

    private void maxProfit(int[] prices) {
        int left = 0, right = 1, stock = prices[0], maxProfit = 0;

        while (right < prices.length) {

            if (prices[left] > prices[right]) {
                left = right;
            } else {
                maxProfit += prices[right] - prices[left];
                left = right + 1;
                right = left;
            }
            right++;
        }
        System.out.println(maxProfit);
    }

}
