package Observer;

public class WeatherStation implements  Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation(){
        this.observers=  new ArrayList<>();
    }


    @java.lang.Override
    public void registerObserver(Observer.Observer observer) {
    }

    @java.lang.Override
    public void removeObserver(Observer.Observer observer) {

    }

    @java.lang.Override
    public void notifyObservers() {

    }
}
