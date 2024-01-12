package interviewPrep;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P3_DuplicateNumberInArray {

    @Test
    public void test(){
        int[] num = {3, 2, 1, 4, 5, 6, 7, 8, 9, 13,9};
        int duplicate = findDuplicateSteam(num);
        System.out.println(duplicate);
    }

    //Time complexity - O(N^2)
    //Space Complexity -O(1)
    private int findDuplicate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i]==num[j]){
                    return num[i];
                }
            }
        }
        return 0;
    }

    private int findDuplicateHM(int[] num){
        Map<Integer,Integer> hm = new HashMap<>();
        for (int n:num) {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Integer,Integer> es:hm.entrySet()) {
            if(es.getValue()>1){
                return es.getKey();
            }
        }
        return 0;
    }

    private int findDuplicateSteam(int[] num){

       return Arrays.stream(num).boxed()
                .collect(Collectors.toMap(Function.identity(),v->1,Integer::sum))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("No Duplicate found"));
    }
}
