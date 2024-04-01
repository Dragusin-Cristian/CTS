package ex1.cts.cristian.dragusin.g1032.builder;

public interface IGamingSystemBuilder {
    public void buildMotherBoard();
    public void buildRAM();
    public void buildSSD();
    public void buildGraphicsCard();
    public IGamingSystem getSystem();
}
