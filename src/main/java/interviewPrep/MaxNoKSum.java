package interviewPrep;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxNoKSum {

    @Test
    public void test(){
        maxOperations(new int[] {1,2,3,4},5);
    }
    public int maxOperations(int[] nums, int k) {
//        int[] nums = {1,2,3,4};
//        int k = 5;

        Map<Integer,Integer> hm = new HashMap<>();
        List<int[]> out = new ArrayList<>();
        int index = 0;
        for(int i : nums){
            hm.put(index++,i);
        }

        for(int i : nums){
            int diff = Math.abs(k-i);
            if(hm.containsValue(diff)){
                int [] temp = new int[2];
                if(i>diff){
                    temp[0] = diff;
                    temp[1] = i;
                }else{
                    temp[0] = i;
                    temp[1] = diff;
                }
                if(!out.contains(temp)){
                    out.add(temp);
                }
            }
        }
        return out.size()/2;
    }

}
