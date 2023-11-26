package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.HashMap;

public class RandsomeNote {

    @Test
    public void testRandsomeNote() {
        String randsomeNote = "aaabc";
        String magazine = "aabcde";
        boolean b = canConstruct(randsomeNote, magazine);
        System.out.println(b);
    }

    @Test
    public void testRandsomeNote1() {
        String randsomeNote = "aabc";
        String magazine = "aabcde";
        boolean b = canConstruct(randsomeNote, magazine);
        System.out.println(b);
    }
    /*
        1. compare the length of randsomeNote and magazine, if the length of magzine is less then return false
        2. iterate through the randsomeNote, and add the values with char and count
        3. now iterate through the magazine, if the randsomeNote check the value present in the map  then decrement the value
        4. finally iterate through the map values, make sure all the values are zero else return false
     */

    //Time complexity - O(N+M)
    //Space Complexity - O(N)
    private boolean canConstruct(String randsomeNote, String magazine) {
        if (magazine.length() < randsomeNote.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : randsomeNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) - 1);
            }
        }

        for (int val : map.values()) {
            if (val > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean canConstructASCII(String randsomeNote, String magazine) {
        int[] randsomeFreq = new int[26];

        for (int i = 0; i < randsomeNote.length(); i++) {
            randsomeFreq[randsomeNote.charAt(i) - 'a']++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            randsomeFreq[magazine.charAt(i) - 'a']--;
        }

        for (int val : randsomeFreq) {
            if (val > 0) {
                return false;
            }
        }
        return true;
    }
}
