package org.sdet5.bfSolution;

import org.testng.annotations.Test;

public class BuySellStock {

    static void findProfit(int[] prices) {

        int left = 0, right = 1, maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                maxProfit = Math.max(prices[right] - prices[left], maxProfit);
            }
            right++;
        }
        System.out.println(maxProfit);
    }

    @Test
    public void testBuySellStock() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        findBuy(prices);
        findProfit(prices);
        findBuyProfit(prices);
    }

    private void findBuy(int[] prices) {

        int buy = prices[0];
        int maxProfit = 0;

        for (int i = 1; i <= prices.length - 1; i++) {
            if (buy > prices[i]) {
                buy = prices[i];
            } else if (prices[i] - buy > maxProfit) {
                maxProfit = prices[i] - buy;
            }
        }

        System.out.println(maxProfit);
    }



    private void findBuyProfit(int[] prices){
        int buy = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length-1; i++) {
            if(prices[i]<buy){
                buy = prices[i];
            } else if (prices[i]-buy > maxProfit) {
                maxProfit = prices[i]-buy;
            }
        }
        System.out.println(maxProfit);
    }
}
