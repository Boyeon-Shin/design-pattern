package ch05.enumsingleton;

public enum Singleton {
    UNIQUE_INSTANCE;

    private boolean empty;
    private boolean boiled;

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            //보일러에 혼합한 재료를 넣음
        }
    }

    public void drain() {
        if (!isEmpty() && !isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 재료를 끓임
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
