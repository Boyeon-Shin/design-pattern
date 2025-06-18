package builder.simple;

public class Main {
    public static void main(String[] args) {

        Person person = new Person
                .Builder("홍길동", "26") // static inner class 초기화 (필수 파라미터)
                .gender("man") // 선택 파라미터
                .job("Warrior")
                .birthday("1800.10.10")
                .address("조선")
                .build();

        System.out.println(person);
    }
}
