package org.sdet5.steams;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class calculateAverageInList {

    @Test
    public void test(){


        findAverage();
    }

    private double findAverage() {

        List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        double out =  nums.stream().mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        System.out.println(out);
        return out;
    }
}
