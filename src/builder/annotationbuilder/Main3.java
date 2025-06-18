package builder.annotationbuilder;

import java.nio.ByteBuffer;
import java.util.stream.Stream;

public class Main3 {
    public static void main(String[] args) {
        String result = new StringBuilder()
                .append("hello ")
                .append("boyeon")
                .toString();   //build

        System.out.println(result);


        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> stream = stringBuilder.add("hello").add("world!").add("bye..").build();

        stream.forEach(System.out::println);


        ByteBuffer buffer = ByteBuffer.allocate(10);

        // 2. put() 메서드로 데이터 쓰기
        buffer.put((byte) 10);
        buffer.put((byte) 20);
        buffer.put((byte) 30);

        // 3. 읽기 모드로 전환
        buffer.flip();

        // 4. 데이터 읽기
        while (buffer.hasRemaining()) {
            byte value = buffer.get();
            System.out.println("읽은 값: " + value);
            }
    }
}
