package builder;

public class CarEngineer {
    private ICarBuilder builder;

    public CarEngineer(ICarBuilder builder){
        this.builder = builder;
    }

    public void buildCar(){
        builder.buildEngine();
        builder.chooseColor();
        builder.buildWheels();

        if(builder instanceof DieselCarBuilder) {
            ((DieselCarBuilder) builder).setAditives();
        }
        if(builder instanceof  ElectricCarBuilder){
            ((ElectricCarBuilder) builder).chooseCharger();
        }
    }

    public ICar getCar(){
        return builder.getCar();
    }
}
