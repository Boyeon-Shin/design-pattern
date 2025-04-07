package ch05.chocolate;

public class ChocolateBoilerSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerSingleton uniqueInstance;

    private ChocolateBoilerSingleton() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoilerSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoilerSingleton();
        }
        return uniqueInstance;
    }

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
