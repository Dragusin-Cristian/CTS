package State.TCPConnectionExample;

public class Main {
    public static void main(String[] args) {
        TCPConnection tcpConnection = new TCPConnection();

        tcpConnection.open();
        tcpConnection.acknowledge();
        tcpConnection.close();

        tcpConnection.acknowledge();
    }
}
