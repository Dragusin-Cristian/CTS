package Observer.MeteoStationExample;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.registerObserver(new WeatherDisplay());
        weatherStation.registerObserver(new WeatherDisplay());

        weatherStation.setMeasurements(1, 1, 1);
        weatherStation.setMeasurements(2, 2, 2);
    }
}
