package BrushUpTopics;

import java.util.Date;

public interface TestingInterface {
    int test = 10;
    public void output();
    public void input();

    default public void time(){
        System.out.println("time "+ new Date());
    }
}
