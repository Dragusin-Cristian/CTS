package HW.ex1.cts.cristian.dragusin.g1032.builder;

public class AGamingSystemBuilder implements IGamingSystemBuilder {
    private AGamingSystem system;

    public AGamingSystemBuilder(){
        this.system = new AGamingSystem();
    }

    @Override
    public void buildMotherBoard() {
        this.system.setMotherBoard("Mother board A");
    }

    @Override
    public void buildRAM() {
        this.system.setRAM(32);
    }

    @Override
    public void buildSSD() {
        this.system.setSSD(1024);
    }

    @Override
    public void buildGraphicsCard() {
        this.system.setGraphicsCard("RTX 3080 TI");
    }

    public void buildMouse() {
        this.system.setMouse("Logitech X");
    }

    public void buildKeyboard() {
        this.system.setKeyboard("Mirya");
    }

    @Override
    public IGamingSystem getSystem() {
        return this.system;
    }
}
