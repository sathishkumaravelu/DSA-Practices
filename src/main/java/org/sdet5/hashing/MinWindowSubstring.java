package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {

    @Test
    public void testMinWindowSubString() {
        String s = "ABBCDA";
        String t = "AABC";

        minWindow(s, t);
    }

    private String minWindow(String s, String t) {
        int minValue = Integer.MAX_VALUE;
        int actualValue;
        int leftptr = 0, rightptr = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);//ABC
        }
        int left = 0, right = 0;
        while (right < s.length()) {
            char charAt = s.charAt(right);
            if (map.equals(map1)) {
                map1.clear();
                actualValue = minValue;
                minValue = Math.min(minValue, right - left);
                if (minValue < actualValue) {
                    leftptr = left;
                    rightptr = right;
                }
                left++;
                right = left;
            } else if (map.containsKey(charAt)) {
                if (!map1.containsKey(charAt)) {
                    map1.put(charAt, map1.getOrDefault(charAt, 0) + 1);
                    right++;
                }
            } else {
                right++;
            }
        }
        if (leftptr == 0 && rightptr == 0) {
            return new String(" ");
        } else {
            return s.substring(leftptr, rightptr);
        }
    }
}
