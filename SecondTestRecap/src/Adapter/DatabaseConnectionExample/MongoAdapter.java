package Adapter.DatabaseConnectionExample;

public class MongoAdapter implements IDatabaseConnection{
    MongoDatabaseConnection mongoDatabaseReader;

    public MongoAdapter(MongoDatabaseConnection mongoDatabaseReader){
        this.mongoDatabaseReader = mongoDatabaseReader;
    }

    @Override
    public String connect() {
        return this.mongoDatabaseReader.connectMongoDB();
    }
}
