package interviewPrep;

import org.testng.annotations.Test;

public class P2_ReverseNumber {

    @Test
    public void test() {
        int num = 765;
        reverseNum(num);
    }

    private void reverseNum(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}
