package org.sdet5.hashing;

import java.util.HashMap;

public class LC1704 {

    public boolean test(){
        String s = "book";
        int half = s.length()/2;
        HashMap<Character,Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length()-1; i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) {
                if (i < half) {
                    countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
                } else {
                    countMap.put(ch, countMap.getOrDefault(ch, 0) - 1);
                }
            }
        }

        /*
        for (char ch:s.toCharArray()) {
            if(isVowel(ch)){
                countMap.put(ch,countMap.getOrDefault(ch,0)+1);
            }
        }*/
        int result = 0;
        for (int i:countMap.values()) {
            result+=i;
        }

        return result !=0;
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U';
    }


}
