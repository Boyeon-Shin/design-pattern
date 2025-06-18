package builder.ex01;

public class Main {
    public static void main(String[] args) {

        Student student2 = new StudentBuilder()
                .id(393933)
                .phoneNumber("303-393993")
                .build();

        System.out.println(student2);

        Student student = new StudentBuilder()
                .id(20223902)
                .name("신보연")
                .grade("Junior")
                .phoneNumber("010-2838-3838")
                .build();

        System.out.println(student);
    }
}
