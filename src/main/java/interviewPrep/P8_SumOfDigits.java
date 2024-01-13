package interviewPrep;

import org.testng.annotations.Test;

public class P8_SumOfDigits {

    @Test
    public void test(){
        int num = 5551;
        printSumOfDigits(num);
    }

    //Time Complexity - O(N)
    //Space Complexity - O(1)
    private void printSumOfDigits(int num) {
        if(num < 0) throw new IllegalArgumentException("Input number should be non-negative.");
        int result =0;
        while (num!=0){
            result+=num%10;
            num/=10;
        }
        System.out.println(result);
    }
}
