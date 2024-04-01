package HW.ex1.cts.cristian.dragusin.g1032.builder;

public class AGamingSystem implements IGamingSystem{
    private String motherBoard;
    private int RAM;
    private int SSD;
    private String graphicsCard;
    private String mouse;
    private String keyboard;

    @Override
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    @Override
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setMouse(String mouse){
        this.mouse = mouse;
    }

    public void setKeyboard(String keyboard){
        this.keyboard = keyboard;
    }

    @Override
    public void printConfiguration() {
        System.out.println("GamingSystem{" +
                "motherBoard='" + motherBoard + '\'' +
                ", RAM=" + RAM +
                ", SSD=" + SSD +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}');
    }
}
