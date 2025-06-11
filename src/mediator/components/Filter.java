package mediator.components;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class Filter extends JTextField implements Component{
    private Mediator mediator;
    private ListModel listModel;

    public Filter() {
    }

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }

    public void setList(ListModel listModel) {
        this.listModel = listModel;
    }

    private void searchElements(String s) {
        if (listModel == null) {
            return;
        }

        if(s.equals("")) {
            mediator.setElementsList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
    }
}
