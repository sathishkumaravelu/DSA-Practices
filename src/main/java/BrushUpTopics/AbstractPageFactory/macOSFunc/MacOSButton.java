package BrushUpTopics.AbstractPageFactory.macOSFunc;

import BrushUpTopics.AbstractPageFactory.Interface.Button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac os Implementation");
    }
}
