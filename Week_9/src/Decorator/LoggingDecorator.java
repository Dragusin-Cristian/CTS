package Decorator;

public class LoggingDecorator implements DataService{
    private DataService wrapee;

    LoggingDecorator(DataService wrapee){
        this.wrapee = wrapee;
    }

    @Override
    public String fetchData() {
        System.out.println("Fetching data...");
        return this.wrapee.fetchData();
    }
}
