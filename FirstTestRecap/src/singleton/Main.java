package singleton;

public class Main {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getConnetion();
        connection.showToken();
    }
}
