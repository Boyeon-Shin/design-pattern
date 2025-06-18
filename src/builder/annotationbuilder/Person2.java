package builder.annotationbuilder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
public class Person2 {
    private final String name;
    private final String age;
    private final String gender;
    private final String job;
    private final String birthday;
    private final String address;

    public static Person2Builder builder(String name, String age) {
        //빌더 파라미터 검증
        if (name == null || age == null) {
            throw new IllegalArgumentException("필수 파라미터 누락");
        }

        //필수 파라미터를 미리 빌드한 빌더 객체를 반환 (지연 빌더 원리)
        return new Person2Builder().name(name).age(age);
    }
}


