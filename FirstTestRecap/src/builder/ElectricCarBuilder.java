package builder;

public class ElectricCarBuilder implements  ICarBuilder{
    private ElectricCar car;

    ElectricCarBuilder(){
        this.car = new ElectricCar();
    }
    @Override
    public void buildEngine() {
        this.car.setEngine("Electrical");
    }

    @Override
    public void chooseColor() {
        this.car.setColor("White");
    }

    @Override
    public void buildWheels() {
        this.car.setWheels(3);
    }

    public void chooseCharger() {
        this.car.setCharger("Mega");
    }

    @Override
    public ICar getCar() {
        return this.car;
    }
}
