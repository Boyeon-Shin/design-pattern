package decorator.ex1;

public interface DataSource {
    void writeData(String data);

    String readData();
}
