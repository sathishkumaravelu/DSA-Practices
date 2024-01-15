package interviewPrep;

import org.testng.annotations.Test;

public class P11_CheckPalindrome {

    @Test
    public void test(){
        int num = 0;
        isPalindrome(num);
    }

    private void isPalindrome(int num) {

        int orginal = num;

        int reversed=0;
        while (num!=0){
            reversed = (reversed*10)+num%10;
            num/=10;
        }
        System.out.println(orginal==reversed);
    }
}
