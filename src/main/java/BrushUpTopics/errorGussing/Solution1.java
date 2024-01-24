package BrushUpTopics.errorGussing;

public class Solution1 {

    static int method1(int i) {
        return ++i;
    }

    static int method2(int i) {
        return method1(++i);
    }
}
