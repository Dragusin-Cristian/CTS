package HW.ex1.cts.cristian.dragusin.g1032.builder;

public class PCEngineer {
    private IGamingSystemBuilder builder;

    public PCEngineer(IGamingSystemBuilder builder){
        this.builder = builder;
    }

    public void build () {
        this.builder.buildGraphicsCard();
        this.builder.buildMotherBoard();
        this.builder.buildRAM();
        this.builder.buildSSD();
        if(this.builder instanceof AGamingSystemBuilder){
            ((AGamingSystemBuilder) this.builder).buildMouse();
            ((AGamingSystemBuilder) this.builder).buildKeyboard();
        }
    }

    public IGamingSystem getSystem(){
        return this.builder.getSystem();
    }
}
