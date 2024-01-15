package interviewPrep;

import org.testng.annotations.Test;

public class P13_Anagram {

    @Test
    public void test() {
        String S = "listen";
        String T = "silent";
        boolean anagram = isAnagram(S, T);
        System.out.println(anagram);
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
}
