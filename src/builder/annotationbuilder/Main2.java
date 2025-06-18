package builder.annotationbuilder;

public class Main2 {
    public static void main(String[] args) {
        Person2 person = Person2.builder("신보연", "22")  // 필수
                .gender("female")
                .job("student")
                .birthday("2003.06.33")
                .address("대전")
                .build();

        System.out.println(person);
    }
}
