package interviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;

public class P4_RemoveElementInArray {

    @Test
    public void test() {

        int[] num = {3, 5, 5, 5, 8, 2, 7, 8, 5, 4};
        int target = 5;
        int[] ints = removeElement(num, target);
        System.out.println(Arrays.toString(ints));
    }

    //Time complexity - O(N)*O(N)
    //Space Complexity - O(1)
    private int[] removeElement(int[] num, int target) {

        int count = 0;
        for (int i : num) {
            if (i == target) count++;
        }

        if (count == 0) return num;
        int[] output = new int[num.length - count];
        int index = 0;
        for (int j : num) {
            if (j != target) {
                output[index++] = j;
            }
        }
        return output;
    }
}
