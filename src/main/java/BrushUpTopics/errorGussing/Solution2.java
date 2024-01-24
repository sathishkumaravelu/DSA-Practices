package BrushUpTopics.errorGussing;

public class Solution2 extends Solution1{

    static int method2(int i) {
        return method2(++i);
    }

    public static void main(String[] args) {
        System.out.println(method2(101));
    }
}
