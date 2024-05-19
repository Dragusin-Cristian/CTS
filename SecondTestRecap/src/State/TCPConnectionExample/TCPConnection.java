package State.TCPConnectionExample;

public class TCPConnection {
    private ITCPState currentState;

    public TCPConnection(){
        currentState = new TCPClosedState();
    }

    public void setState(ITCPState state){
        this.currentState = state;
    }

    public void open(){
        currentState.open(this);
    }

    public void close() {
        currentState.close(this);
    }

    public void acknowledge(){
        currentState.acknowledge(this);
    }


}
