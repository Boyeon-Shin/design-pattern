package builder.annotationbuilder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("신보연")
                .age("22")
                .gender("female")
                .job("student")
                .birthday("2003.06.33")
                .address("대전")
                .build();

        System.out.println(person);
    }
}
