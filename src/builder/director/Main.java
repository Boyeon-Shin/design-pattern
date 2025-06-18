package builder.director;

public class Main {
    public static void main(String[] args) {
        Data data = new Data("신보연", 39);

        Builder builder1 = new PlainTextBuilder(data);
        Director director = new Director(builder1);
        String result = director.build();
        System.out.println(result);

        System.out.println();

        Builder builder2 = new JSONBuilder(data);
        director = new Director(builder2);
        result = director.build();
        System.out.println(result);

        System.out.println();

        Builder builder3 = new XMLBuilder(data);
        director = new Director(builder3);
        result = director.build();
        System.out.println(result);
    }
}
