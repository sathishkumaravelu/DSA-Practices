package org.sdet5.arrays;

import org.testng.annotations.Test;

import java.util.*;

public class VendingMachine {


    @Test
    public void testVendingMachine() {
        int cash = 500, price = 20;
        Map<Integer, Integer> changeToGet = findTheChange(cash, price);
        for (Map.Entry<Integer, Integer> entry : changeToGet.entrySet()) {
            System.out.println(entry.getKey() + " * " + entry.getValue());
        }

    }

    private Map<Integer, Integer> findTheChange(int cash, int price) {
        int[] acceptCash = new int[]{10, 50, 100, 500};
        Map<Integer, Integer> resultChange = new HashMap<>();

        if (Arrays.stream(acceptCash).anyMatch(element -> element == cash)) {
            int change = cash - price;
            for (int i = acceptCash.length - 1; i >= 0; i--) {
                while (change >= acceptCash[i]) {
                    change -= acceptCash[i];
                    resultChange.put(acceptCash[i], resultChange.getOrDefault(acceptCash[i], 0) + 1);
                }
            }
        } else {
            System.out.println("cash not accepted");
            return resultChange;
        }

        return resultChange;


    }
}
