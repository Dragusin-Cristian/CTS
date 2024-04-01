package builder;

public class DieselCarBuilder implements ICarBuilder{
    private DieselCar m;

    DieselCarBuilder() {
        this.m = new DieselCar();
    }

    @Override
    public void buildEngine() {
        this.m.setEngine("V8");
    }

    @Override
    public void chooseColor() {
        this.m.setColor("red");
    }

    @Override
    public void buildWheels() {
        this.m.setWheels(4);
    }

    public void setAditives(){
        this.m.setAdditives("no idea");
    }

    @Override
    public ICar getCar() {
        return this.m;
    }
}
