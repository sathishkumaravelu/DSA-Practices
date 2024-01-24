package org.sdet5.hashing;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortThruValue {

    @Test
    public void test() {
        String[] inputName = {"Ashok", "Sathish", "Guna"};
        int[] age = {33, 28, 29};
        sortThruValue(inputName, age);
    }

    private void sortThruValue(String[] inputName, int[] age) {

        Map<String, Integer> inputMap = new HashMap<>();

        int i = 0;
        for (String name : inputName) {
            inputMap.put(name, age[i++]);
        }
        System.out.println(inputMap);

        LinkedHashMap<String, Integer> sortedHashMap = inputMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        LinkedHashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll
                );
        sortedHashMap.forEach((key, value) -> System.out.println(key + ", " + value));
    }


}
