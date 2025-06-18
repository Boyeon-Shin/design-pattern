package builder.ex01;

/*
    Student 클래스에 대한 객체 생성만을 담당하는 별도의 빌더 클래스 만들기
    - 각 멤버에 대한 Setter 메서드를 구현해줌 (가독성과 기존 set과 구분하기 위해 set은 제거)
    - return this -> 빌더 객체가 자신을 라턴함으로써 메서드 호출후 연속적으로 빌더 메서드들을 체이닝 하여 호춣할 수 있게 됨
 */
public class StudentBuilder {
    private int id;
    private String name = "boboob";
    private String grade;
    private String phoneNumber;

    public StudentBuilder id(final int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder grade(final String grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder phoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Student build() {
        return new Student(id, name, grade, phoneNumber);  //student 생성자 호출
    }
}
