package templateMathod;

public class HotChicken extends Cook {

    @Override
    void ingredients() {
        System.out.println("라면 준비.");
    }

    @Override
    void heat() {
        System.out.println("불닭볶음면 끓이는중.");
    }

    @Override
    void plating() {
        System.out.println("둥근 그릇에 불닭볶음면을 담는다.");
    }

}

