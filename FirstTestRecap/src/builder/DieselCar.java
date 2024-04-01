package builder;

public class DieselCar implements ICar{
    String engine;
    String color;
    int wheels;
    String additives;

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setAdditives(String additives) {
        this.additives = additives;
    }

    @Override
    public String getDetails() {
        return "DieselCar{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", additives='" + additives + '\'' +
                '}';
    }
}
