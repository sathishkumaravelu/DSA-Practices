package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.*;

public class GroupAnagram {

    @Test
    public void testGroupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        System.out.println(lists);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String i : strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(i);
        }
        return new ArrayList<>(map.values());
    }
}
