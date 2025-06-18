package templateMathod;

public class BokkEumbab extends Cook{

    @Override
    void ingredients() {
        System.out.println("야채를 자른다.");
        System.out.println("밥을 짓는다.");
    }

    @Override
    void heat() {
        System.out.println("재료를 다 같이 볶는다.");
    }

    @Override
    void plating() {
        System.out.println("접시에 담는다.");
    }
}
