package interviewPrep;

import org.testng.annotations.Test;

public class P1_ReverseString {

    @Test
    public void test(){
        String str = "Ticket";
        String s = reverseWordTwoPointer(str);
        System.out.println(s);
    }

    private String reverseWord(String str) {
        char[] charArray = str.toCharArray();
        int rightPtr = charArray.length-1;
        StringBuilder str1 = new StringBuilder();
        while (rightPtr>=0){
            str1.append(charArray[rightPtr--]);
        }
        return str1.toString();
    }

    /*
        1. convert the string into a character array
        2. have two pointer left as zero and right pointer to length of the charArray-1
        3. swap the values left point to right pointer by iterating the left and right pointer cross
        4. return the new string object by passing charArray as parameter
     */

    //Time complexity - O(N)
    //Space Complexity - O(1)
    private String reverseWordTwoPointer(String str){
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length-1;
        while (left<right){
            char temp = charArray[right];
            charArray[right--]= charArray[left];
            charArray[left++]=temp;
        }
        return new String(charArray);
    }
}
