package interviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P10_TwoSum {

    @Test
    public void test() {

        int[] num = {7, 2, 11, 15};
        int target = 9;
        int[] twoSum = findTwoSum(num, target);
        String op = Arrays.toString(twoSum);
        System.out.println(op);
    }


    @Test
    public void test1() {

        int[] num = {7, 2, 11, 15};
        int target = 19;
        int[] twoSum = findTwoSum2P(num, target);
        String op = Arrays.toString(twoSum);
        System.out.println(op);
    }

    //Time complexity - O(N)
    //Space Complexity - O(N)
    private int[] findTwoSum(int[] num, int target) {
        //Arrays.sort(num);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int diff = Math.abs(target - num[i]);
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(num[i], i);
        }
        return new int[]{-1, -1};
    }


    //Time Complexity - O(N log N)
    //Space Complexity - O(N)
    private int[] findTwoSum2P(int[] num, int target){
        Arrays.sort(num);
        int left = 0, right = num.length-1;

        while(left<right){

            if(num[left]+num[right]==target){
                return new int[] {left,right};
            } else if (num[left]+num[right]>target) {
                right--;
            }else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
