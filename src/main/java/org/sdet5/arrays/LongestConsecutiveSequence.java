package org.sdet5.arrays;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    @Test
    public void test() {
        int longestSeq = findLongestSeq(new int[]{100, 4, 200, 1, 3, 2});
        System.out.println(longestSeq);
    }

    private int findLongestSeq(int[] ints) {
        if (ints.length == 0) return 0;
        if (ints.length == 1) return ints.length;
        Arrays.sort(ints);
        HashSet<Integer> set = new HashSet<>();
        for (int num : ints) {
            set.add(num);
        }

        int maxLength = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                maxLength = Math.max(maxLength, currentStreak);
            }
        }
        return maxLength;
    }
}
