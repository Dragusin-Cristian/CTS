package Adapter.DatabaseConnectionExample;

public class Main {
    public static void main(String[] args) {
        IDatabaseConnection mongoAdapter = new MongoAdapter(new MongoDatabaseConnection());
        IDatabaseConnection postgresAdapter = new PostgresAdapter((new PostgresDatabaseConnection()));
        System.out.println(mongoAdapter.connect());
        System.out.println(postgresAdapter.connect());
    }
}
