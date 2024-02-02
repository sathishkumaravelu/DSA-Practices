package interviewPrep;

import org.testng.annotations.Test;

import java.util.stream.IntStream;

public class StringTransformation {

    @Test
    public void test(){
        formStringPatter("Sathish Kumaravelu");
        formStringPattern("Sathish Kumaravelu");
    }

    private void formStringPatter(String str) {
        char[] ch = str.toCharArray();
        for (int i = 1; i < ch.length; i+=2) {
            if(ch[i]!=' '){
                ch[i] = '@';
            }
        }
        System.out.println(new String(ch));
    }

    public void formStringPattern(String str){
        char[] ch = str.toCharArray();

        IntStream.iterate(1, i -> i + 2)
                .limit((ch.length + 1) / 2)
                .filter(i -> ch[i - 1] != ' ')
                .forEach(i -> ch[i - 1] = '@');
        System.out.println(new String(ch));
    }
}
