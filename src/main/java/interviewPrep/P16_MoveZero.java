package interviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;

public class P16_MoveZero {

    /*
        [1,0,0,12,0]
        [0000]
        [1,1,1,1]
     */

    /*
        1. have two pointer left and right. left is zero and right length of array
        2. decrement pointer right if the default its zero
        3. check if the right pointer is non zero and left zero, swap and move the pointer left and right
        4. if the left pointer is non zero then move the left alone
     */

    @Test
    public void test(){
        moveZero(new int[]{1,0,0,12,0});
        moveZero(new int[]{0,0,0,1});
        moveZero(new int[]{0,0,0});
        moveZero(new int[]{1,1,1,1});
    }

    private void moveZero(int[] ints) {

        int left = 0, right = ints.length-1;
        while(left<right){
            if(ints[left]==0 && ints[right]!=0){
                int temp = ints[left];
                ints[left++] = ints[right];
                ints[right--] = temp;
            }else if(ints[left]!=0){
                left++;
            }else {
                right--;
            }
        }
        System.out.println(Arrays.toString(ints));
    }
}
