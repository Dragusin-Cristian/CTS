package Observer.MeteoStationExample;

public interface IObserver {
    void update(float temperature, float humidity, float pressure);
}
