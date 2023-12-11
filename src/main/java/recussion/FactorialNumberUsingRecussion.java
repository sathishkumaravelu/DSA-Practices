package recussion;


import org.testng.annotations.Test;

public class FactorialNumberUsingRecussion {

    @Test
    public void testFactorial(){
        int i = calculateFactorial(10);
        System.out.println(i);
    }

    private int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
