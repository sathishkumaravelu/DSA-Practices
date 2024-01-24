package org.sdet5.steams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListOfStringToUC_LC {


    public  void main1(String[] args) {
        List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        List<String> collect = colors.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("RED", "white", "Yellow", "bluE");

        List<String> outputList = inputList.stream()
                .map(s -> s.equals(s.toUpperCase()) ? s.toLowerCase() : s.toUpperCase())
                .toList();

        // Display the output list
        System.out.println("Output List:");
        outputList.forEach(System.out::println);
    }
}
