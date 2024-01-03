package BrushUpTopics.AbstractPageFactory.App;

import BrushUpTopics.AbstractPageFactory.Interface.Button;
import BrushUpTopics.AbstractPageFactory.Interface.Checkbox;
import BrushUpTopics.AbstractPageFactory.Interface.GUIFactory;

public class Application{
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
