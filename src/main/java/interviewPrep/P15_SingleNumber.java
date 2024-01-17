package interviewPrep;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P15_SingleNumber {

    /*
        Find the Single Number.
     */

    @Test
    public void test(){
        int[] num = {2,2,1,6,1,6};
        int singleNumber = findSingleNumber(num);
        System.out.println(singleNumber);
    }

    private int findSingleNumber(int[] num) {
        Map<Integer,Integer> hm = new HashMap<>();

        for (int i :num) {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> es:hm.entrySet()) {
            if(es.getValue()==1){
                return es.getKey();
            }
        }
        return -1;
    }
}
