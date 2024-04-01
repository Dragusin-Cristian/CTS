package builder;

public class Main {
    public static void main(String[] args) {
        ICarBuilder builder = new DieselCarBuilder();
        CarEngineer engineer = new CarEngineer(builder);

        engineer.buildCar();
        ICar dieselCar = engineer.getCar();
        System.out.println(dieselCar.getDetails());

        builder = new ElectricCarBuilder();
        engineer = new CarEngineer(builder);

        engineer.buildCar();
        ICar electricCar = engineer.getCar();
        System.out.println(electricCar.getDetails());
    }
}
