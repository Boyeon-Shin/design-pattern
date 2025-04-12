package singleton.singletonenum;

enum SingletonEnum {
    INSTANCE;

    private final Client dbClient;

    SingletonEnum() {
        dbClient = Database.getClient();
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public Client getClient() {
        return dbClient;
    }
}
