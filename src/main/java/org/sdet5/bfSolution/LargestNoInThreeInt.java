package org.sdet5.bfSolution;

import org.testng.annotations.Test;

public class LargestNoInThreeInt {

    @Test
    public void testLargestNos(){
        findTheLargestNo(10,15,20);
    }

    //Time Complexity - O(1)
    //Space Complexity - O(1)
    private void findTheLargestNo(int x, int y, int z) {
        if(x>y && x>z){
            System.out.println("first no is largest :"+x);
        } else if (y>x & y>z) {
            System.out.println("second no is largest :"+y);
        } else if (z>x && z>y) {
            System.out.println("third no is largest :"+z);
        }else {
            System.out.println("all three are equal");
        }

    }
}
