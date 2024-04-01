package builder;

public class ElectricCar implements ICar{
    String engine;
    String color;
    int wheels;
    String charger;

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

    public void setCharger(String charger){
        this.charger = charger;
    }
    @Override
    public String getDetails() {
        return "ElectricCar{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                ", charger='" + charger + '\'' +
                '}';
    }
}
