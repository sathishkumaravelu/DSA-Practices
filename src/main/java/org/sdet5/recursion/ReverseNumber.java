package org.sdet5.recursion;

import org.testng.annotations.Test;

public class ReverseNumber{

    @Test
    public void test() {
        int num = 647;
        int i = reverseNum(num);
        System.out.println(i);
    }

        private int reverseNum(int num) {

            return reverseHelper(num, 0);
        }

        public static int reverseHelper(int number,int reversed) {
            if(number==0) {
                return reversed;
            }
            int digit = number % 10;
            return reverseHelper(number / 10, reversed * 10 + digit);
        }
}
