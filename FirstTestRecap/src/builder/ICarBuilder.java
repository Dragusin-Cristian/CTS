package builder;

public interface ICarBuilder {
    public void buildEngine();
    public void chooseColor();
    public void buildWheels();

    public ICar getCar();
}
