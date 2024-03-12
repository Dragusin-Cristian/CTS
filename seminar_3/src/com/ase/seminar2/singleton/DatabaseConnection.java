package com.ase.seminar2.singleton;

public class DatabaseConnection {
    public static volatile DatabaseConnection instance;

    private DatabaseConnection(){}

    public static DatabaseConnection getConnection() {
        if(instance == null) {
            synchronized (DatabaseConnection.class) {
                instance = new DatabaseConnection();
            }
        }
        return instance;
    }
}
