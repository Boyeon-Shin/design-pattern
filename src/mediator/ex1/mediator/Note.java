package mediator.ex1.mediator;

public class Note {
    private String name;
    private String text;

    public Note() {
        name = "New note";
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return name;
    }
}
