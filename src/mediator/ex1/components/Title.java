package mediator.ex1.components;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import mediator.ex1.mediator.Mediator;

public class Title extends JTextField implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
