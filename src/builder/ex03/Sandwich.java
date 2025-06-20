package builder.ex03;

import java.util.List;

public class Sandwich {
    private String bread;
    private String meat;
    private String cheese;
    private List<String> vegetable;
    private List<String> sauce;

    public Sandwich(final String bread, final String meat, final String cheese, final List<String> vegetable,
                    final List<String> sauce) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.vegetable = vegetable;
        this.sauce = sauce;
    }

    public void print() {
        System.out.println("Sandwich{" +
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", vegetable=" + vegetable +
                ", sauce=" + sauce +
                '}');
    }
}
