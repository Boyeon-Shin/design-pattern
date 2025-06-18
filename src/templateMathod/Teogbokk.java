package templateMathod;

public class Teogbokk extends Cook{
    @Override
    void ingredients() {
        System.out.println("떡을 물에 씻는다.");
        System.out.println("야채를 썬다");
    }

    @Override
    void heat() {
        System.out.println("떡과 재료를 함께 가열한다.");
    }

    @Override
    void plating() {
        System.out.println("납작 접시에 담는다.");
    }

}
