package interviewPrep;

import org.testng.annotations.Test;

public class P5_FindMinElementArray {

    @Test
    public void test() {
        int[] num = {5, 2, 3, 4, 5, 1};
        int minimumEle = findMinimumEle(num);
        System.out.println(minimumEle);
    }

    private int findMinimumEle(int[] num) {

        if (num.length == 0) throw new IllegalArgumentException("Input array is empty");
        int minEle = num[0];
        for (int i : num) {
            if (i < minEle) {
                minEle = i;
            }
        }
        return minEle;
    }
}
