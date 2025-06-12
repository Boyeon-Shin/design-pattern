package mediator.ex1;

import javax.swing.DefaultListModel;
import mediator.ex1.components.AddButton;
import mediator.ex1.components.DeleteButton;
import mediator.ex1.components.Filter;
import mediator.ex1.components.List;
import mediator.ex1.components.SaveButton;
import mediator.ex1.components.TextBox;
import mediator.ex1.components.Title;
import mediator.ex1.mediator.Editor;
import mediator.ex1.mediator.Mediator;

public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}