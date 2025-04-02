package strategy.ex2;

public class Robot {
    private String name;
    private MoveStrategy move;
    private TranslateStrategy translate;

    public Robot(String name, MoveStrategy move, TranslateStrategy translate) {
        this.name = name;
        this.move = move;
        this.translate = translate;
    }

    public void display() {
        System.out.println(name);
    }

    public void move() {
        move.move();
    }

    public void translate() {
        translate.translate();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMove(final MoveStrategy move) {
        this.move = move;
    }

    public void setTranslate(final TranslateStrategy translate) {
        this.translate = translate;
    }
}
