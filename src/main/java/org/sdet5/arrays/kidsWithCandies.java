package org.sdet5.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {

    //Time complexity - O(N^2)
    //Space Complexity - O(N)
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        for(int i = 0; i<candies.length;i++){
            int temp = candies[i] + extraCandies;
            result.add(checkCandies(i,temp,candies));
        }
        return result;
    }

    public boolean checkCandies (int index, int val,int[] candies){

        for(int i = 0 ; i<candies.length;i++){
            if(val < candies[i] && i != index){
                return false;
            }
        }
        return true;
    }

    @Test
    public void testCase(){
        List<Boolean> booleans = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        Assert.assertEquals(new boolean[] {true,true,true,false,true},booleans.toArray());
    }
}
