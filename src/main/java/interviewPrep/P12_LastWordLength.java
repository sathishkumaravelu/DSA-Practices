package interviewPrep;

import org.testng.annotations.Test;

public class P12_LastWordLength {

    @Test
    public void test(){
        String s = "This is Amazing ";
        int lastLength = findLastLength(s);
        System.out.println(lastLength);
    }

    private int findLastLength(String s) {
        char[] charArray = s.toCharArray();
        int right = charArray.length-1;
        int length = 0;

        while (right >= 0 && charArray[right] == ' ') {
            right--;
        }
        while (right >= 0 && charArray[right] != ' ') {
            length++;
            right--;
        }
        return length;
    }


    private int findLastWordLength(String s) {
        int right = s.length()-1, maxLength = 0;
        while(right>0){
            char ch = s.charAt(right);
            if(maxLength==0 && ch==' '){
                right--;
            }else if(ch!=' '){
                right--;
                maxLength++;
            } else {
                return maxLength;
            }
        }
        return  maxLength;
    }
}
