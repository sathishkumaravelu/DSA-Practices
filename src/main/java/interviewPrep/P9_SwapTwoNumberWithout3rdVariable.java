package interviewPrep;

import org.testng.annotations.Test;

public class P9_SwapTwoNumberWithout3rdVariable {
    @Test
    public void test() {
        int a = -20, b = 2;
        swapTwoNo(a, b);
    }

    private void swapTwoNo(int a, int b) {
        System.out.println("Before Swap : ------------------->");
        System.out.println("a :" + a);
        System.out.println("b :" + b);


        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap : ------------------->");
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }
}
