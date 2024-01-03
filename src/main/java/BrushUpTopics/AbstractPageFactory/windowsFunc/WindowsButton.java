package BrushUpTopics.AbstractPageFactory.windowsFunc;

import BrushUpTopics.AbstractPageFactory.Interface.Button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button Implementation");
    }
}
