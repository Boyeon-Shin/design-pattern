package templateMathod;

public abstract class Cook {

    final void cooking() {
        ingredients();
        heat();
        plating();
    }

    abstract void plating();

    abstract void heat();

    abstract void ingredients();

}
