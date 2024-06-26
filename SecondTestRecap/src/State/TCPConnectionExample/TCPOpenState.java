package State.TCPConnectionExample;

public class TCPOpenState implements ITCPState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection is already open");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection");
        connection.setState(new TCPClosedState());
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Acknowledge data");
    }
}
