package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacter {

    /*
        count the number of character in the given string
     */

    @Test
    public void testCharCount() {
        String str = "Sathish";
        findCharCount(str);
        findCharCountCharArray(str);
    }

    //Time Complexity - O(N)
    //Space Complexity - O(N)
    private void findCharCount(String str) {
        // to maintain the order of the value using the LinkedHashMap
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(Character.toLowerCase(c), frequencyMap.getOrDefault(Character.toLowerCase(c), 0) + 1);
        }
        for (Map.Entry<Character, Integer> setVal : frequencyMap.entrySet()) {
            System.out.print(setVal.getKey() + ": " + setVal.getValue() + " ");
        }
        System.out.println();
    }

    //Time Complexity - O(N)
    //Space Complexity - O(1)
    private void findCharCountCharArray(String str) {
        // Assuming ASCII characters, you can adjust the size based on the character set
        int[] frequencyArray = new int[128];

        // Iterate through the characters of the string
        for (char c : str.toCharArray()) {
            // Update the frequency array for each character
            frequencyArray[Character.toLowerCase(c)]++;
        }

        // Print the character frequencies
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                System.out.print((char) i + ": " + frequencyArray[i] + " ");
            }
        }
        System.out.println();
    }
}
