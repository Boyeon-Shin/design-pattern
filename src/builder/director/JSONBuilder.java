package builder.director;

class JSONBuilder extends Builder {

    public JSONBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "{\n";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

        sb.append("\t\"Name\" : ");
        sb.append("\"" + data.getName() + "\",\n");
        sb.append("\t\"Age\" : ");
        sb.append(data.getAge());

        return sb.toString();
    }

    @Override
    public String foot() {
        return "\n}";
    }
}