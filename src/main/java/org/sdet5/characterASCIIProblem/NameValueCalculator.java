package org.sdet5.characterASCIIProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameValueCalculator {
    public static void main(String[] args) {
        List<String> inputList = List.of("abc", "abc abc");
        List<Integer> result = calculateNameValues(inputList);
        System.out.println("Result: " + result);
    }

    private static List<Integer> calculateNameValues(List<String> inputList) {
        List<Integer> result = new ArrayList<>();

        Iterator<String> iterator = inputList.iterator();
        int index = 1;
        while (iterator.hasNext()){
            String stringValue = iterator.next();
            int stingValue = getStingValue(stringValue);
            result.add(stingValue*index++);
        }
        return result;
    }

    private static int getStingValue(String stringValue) {

        int result = 0;
        for (char ch:stringValue.toCharArray()) {
            if(ch != ' '){
                int temp = ch -'a'+1;
                result+=temp;
            }
        }
        return result;
    }

}
