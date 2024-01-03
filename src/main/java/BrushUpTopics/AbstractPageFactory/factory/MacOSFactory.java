package BrushUpTopics.AbstractPageFactory.factory;

import BrushUpTopics.AbstractPageFactory.Interface.Button;
import BrushUpTopics.AbstractPageFactory.Interface.Checkbox;
import BrushUpTopics.AbstractPageFactory.Interface.GUIFactory;
import BrushUpTopics.AbstractPageFactory.macOSFunc.MacOSButton;
import BrushUpTopics.AbstractPageFactory.macOSFunc.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }
}
