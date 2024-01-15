package interviewPrep;

import org.testng.annotations.Test;

import java.util.*;

public class P14_GroupAnagram {

    @Test
    public void test() {
        String[] input = {"listen", "silent", "hello", "world", "rail safety", "fairy tales"};
        groupAnagramMap(input);
    }

    private void groupAnagram(String[] input) {
        List<List<String>> output = new ArrayList<>();
        List<String> groupAnagram = new ArrayList<>();

        for (int i = 0; i <= input.length; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                boolean anagram = isAnagram(input[i], input[j]);
                if (anagram) {
                    if (!groupAnagram.contains(input[i])) {
                        groupAnagram.add(input[i]);
                    }
                    if (!groupAnagram.contains(input[j])) {
                        groupAnagram.add(input[j]);
                    }
                }
            }
        }
        System.out.println(groupAnagram);
    }

    private boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freqArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freqArray[s.charAt(i) - 'a']++;
            freqArray[t.charAt(i) - 'a']--;
        }
        for (int i : freqArray) {
            if (i != 0) return false;
        }
        return true;
    }

    private List<List<String>> groupAnagramMap(String[] input) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : input) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());
        System.out.println(result);
        return result;
    }
}
