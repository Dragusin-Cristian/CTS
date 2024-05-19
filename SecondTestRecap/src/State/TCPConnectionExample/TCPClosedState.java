package State.TCPConnectionExample;

public class TCPClosedState implements ITCPState {
    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection");
        connection.setState((new TCPOpenState()));
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Connection already closed");
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Can't acknowledge data. Connection is closed");
    }
}
