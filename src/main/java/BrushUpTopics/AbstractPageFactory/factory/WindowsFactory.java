package BrushUpTopics.AbstractPageFactory.factory;

import BrushUpTopics.AbstractPageFactory.Interface.Button;
import BrushUpTopics.AbstractPageFactory.Interface.Checkbox;
import BrushUpTopics.AbstractPageFactory.Interface.GUIFactory;
import BrushUpTopics.AbstractPageFactory.windowsFunc.WindowsButton;
import BrushUpTopics.AbstractPageFactory.windowsFunc.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}
