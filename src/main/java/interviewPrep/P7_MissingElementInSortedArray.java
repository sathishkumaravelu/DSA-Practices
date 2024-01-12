package interviewPrep;

import org.testng.annotations.Test;

import java.util.HashSet;

public class P7_MissingElementInSortedArray {

    /*
        How to find the missing number in a sorted array in range {1,N}
    */
    @Test
    public void test() {
        int[] num = {1, 2, 3, 4, 5, 6};
        int missingElement = findMissingElement(num);
        System.out.println(missingElement);
    }

    @Test
    public void test1() {
        int[] num = {1, 2, 3, 4, 5, 6};
        int missingElement = findMissingElementHashSet(num);
        System.out.println(missingElement);
    }

    private int findMissingElement(int[] num) {

        if (num == null || num.length == 0) {
            throw new IllegalArgumentException("Input array is empty or null.");
        }

        int actualSum = ((num.length + 1) * (num.length + 2)) / 2;

        for (int n : num) {
            actualSum -= n;
        }
        return actualSum;
    }


    private int findMissingElementHashSet(int[] num) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <= num.length - 1; i++) {
            set.add(num[i]);
        }

        for (int i = 1; i <= num.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return num.length + 1;

    }
}
