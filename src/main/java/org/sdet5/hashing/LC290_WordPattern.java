package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

public class LC290_WordPattern {

    @Test
    public void testWordPattern() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean wordPatternCorrect = isWordPatternCorrect(pattern, s);
        System.out.println(wordPatternCorrect);
    }

    private boolean isWordPatternCorrect(String pattern, String s) {
        HashMap<Character, Integer> patternMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        HashMap<String, Integer> sMap = new HashMap<>();
        String[] split = s.split(" ");
        for (String c : split) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }
        List<Integer> patternValues = patternMap.values().stream().toList();
        List<Integer> sValues = sMap.values().stream().toList();
        return patternValues.equals(sValues);
    }
}
