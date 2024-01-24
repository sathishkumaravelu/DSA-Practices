package org.sdet5.steams;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {

    @Test
    public void test() {
        int[] nums = {10, 23, 22, 23, 24, 24, 33, 15, 26, 15};
        removeDuplicate(nums);

    }

    public void removeDuplicate(int[] nums) {

        List<Integer> distinctNumbers = Arrays.stream(nums)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
        distinctNumbers.forEach(System.out::print);
        System.out.println(distinctNumbers);
    }
}
