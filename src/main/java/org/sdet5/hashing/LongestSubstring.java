package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {

    @Test
    public void testLongestSubstring() {
        String word = "auab";
        int longestSubString = findLongestSubStringSet(word);
        System.out.println(longestSubString);
    }

    /*
        Pseudocode :
        1. create a Hashmap with character,Integer
        2. keep left and right pointer to zero
        3. check if the value of the right pointer is available in the map then clear the map else
            if  it's not contains then add the value in map and keep the count
        4. finally return the count
     */

    //Time Complexity - O(N)
    //Space Complexity - O(N)

    private int findLongestSubString(String word) {
        if (word.length() <= 1) return word.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int longCount = Integer.MIN_VALUE;
        while (right <= word.length() - 1) {
            if (!map.containsKey(word.charAt(right))) {
                map.put(word.charAt(right), 1);
                longCount = Math.max((right + 1) - left, longCount);
                right++;
            } else {
                map.clear();
                left++;
                right = left;
            }
        }

        System.out.println(longCount);
        return longCount;
    }


    private int findLongestSubStringSet(String word) {
        if (word.length() <= 1) return word.length();
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int longCount = 0;
        while (right < word.length()) {
            if (!set.contains(word.charAt(right))) {
                set.add(word.charAt(right));
                longCount = Math.max(right - left + 1, longCount);
                right++;
            } else {
                set.remove(word.charAt(left));
                left++;
            }
        }
        System.out.println(longCount);
        return longCount;
    }
}
