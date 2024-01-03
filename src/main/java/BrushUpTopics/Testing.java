package BrushUpTopics;

import org.testng.annotations.Test;

public class Testing extends AbstractLearning implements TestingInterface {


    @Override
    public void printDefaultValue() {
        super.printDefaultValue();
        System.out.println("Testing Methods implemented");
    }


    @Test
    public void test(){
        Testing objs = new Testing();
        objs.printDefaultValue();
        time();
        TestingInterface test = new Testing();
        test.input();
        test.output();
    }

    @Override
    public void output() {
        System.out.println("Implementation class output");
    }

    @Override
    public void input() {
        System.out.println(test);
       // test = 15;

       super.input();
    }

}
