package interviewPrep;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Interview_Capco_charactercount {

    @Test
    public void test(){
        String name = "automation";
        findCharCount(name);
    }

    //Time COmplexity - O(N)
    //Space Complexity - O(1)

    private void findCharCount(String name) {
        Map<Character,Integer> freqMap = new HashMap<>();

        for (char ch:name.toCharArray()) {
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> es:freqMap.entrySet()) {

            System.out.println(es.getKey() +" - "+es.getValue());
        }

    }

    /*
        1. HashMap (Char, Interger) : iterate through my given string start adding it to my hashmap

            - if it not present i will add 1 or if it present then +1;
        2. I can iterate through my hashMap and get the key and value and print the count
     */


}
