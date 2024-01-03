package org.sdet5.arrays;

import org.testng.annotations.Test;

import javax.swing.plaf.RootPaneUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC2610 {

    @Test
    public void test(){
        List<List<Integer>> matrix = findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1});
        System.out.println(matrix);
    }

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> op = new ArrayList<>();
        int arr[] = new int[nums.length+1];

        for (int num:nums) {
            if(arr[num]>=op.size()){
                op.add(new ArrayList<>());
            }
            op.get(arr[num]).add(num);
            arr[num]++;
        }
        return op;
    }


    public List<List<Integer>> findMatrixSet(int[] nums){
        List<List<Integer>> output = new ArrayList<>();

        Map<Integer,Integer> indexMap = new HashMap<>();

        for (int num :nums) {
            int index = indexMap.getOrDefault(num,output.size());
            if(index== output.size()){
                output.add(new ArrayList<>());
            }
            output.get(index).add(num);
            indexMap.put(num, index + 1);
        }

        return output;

    }
}
