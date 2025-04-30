package decorator.ex1;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource dataSource) {
        this.wrappee = dataSource;
    }

    @Override
    public void writeData(final String data) {
        wrappee.writeData(data);
        System.out.println("DataSourceDecorator: Data written.......");
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
