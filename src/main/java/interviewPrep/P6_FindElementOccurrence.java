package interviewPrep;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P6_FindElementOccurrence {

    @Test
    public void test(){
        int[] num = {5, 3, 8, 2, 7, 4, 5, 3, 2, 7, 5};
        findEleOccurance(num);
    }

    //Time complexity - O(N)
    //Space Complexity - O(M)
    private void findEleOccurance(int[] num) {

        if(num.length==0)
            throw new IllegalArgumentException("input array is empty");

        Map<Integer,Integer> freqCount = new HashMap<>();
        for (int n:num) {
            freqCount.put(n,freqCount.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Integer,Integer> es:freqCount.entrySet()) {
            System.out.println(es.getKey() +" -> "+es.getValue());
        }
    }
}
