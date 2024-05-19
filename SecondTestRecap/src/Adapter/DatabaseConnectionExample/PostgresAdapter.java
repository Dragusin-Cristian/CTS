package Adapter.DatabaseConnectionExample;

public class PostgresAdapter implements IDatabaseConnection{
    PostgresDatabaseConnection postgresDatabaseConnection;

    public PostgresAdapter(PostgresDatabaseConnection postgresDatabaseConnection){
        this.postgresDatabaseConnection = postgresDatabaseConnection;
    }

    @Override
    public String connect() {
        return this.postgresDatabaseConnection.connectPostgresDb();
    }
}
