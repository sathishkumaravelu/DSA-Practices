package BrushUpTopics.AbstractPageFactory.windowsFunc;

import BrushUpTopics.AbstractPageFactory.Interface.Checkbox;

public class WindowsCheckBox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Windows Implementation");
    }
}
