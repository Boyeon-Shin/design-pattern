package builder.ex01;

public class Student {
    private int id;
    private String name = "홍길동";
    private String grade = "freshman";
    private String phoneNumber = "010-0000-0000";

    public Student(final int id, final String name, final String grade, final String phoneNumber) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}


