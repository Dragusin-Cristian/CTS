package Observer.MeteoStationExample;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ISubject{
    List<IObserver> observers = new ArrayList<>();
    float temperature;
    float humidity;
    float pressure;

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : this.observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.notifyObservers();
    }
}
