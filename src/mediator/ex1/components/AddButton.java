package mediator.ex1.components;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import mediator.ex1.mediator.Mediator;
import mediator.ex1.mediator.Note;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
