package ex1.cts.cristian.dragusin.g1032.singleton;

public class TestingModule implements ITesingModule{
    private static TestingModule instance;

    private TestingModule(){}

    public static TestingModule getTestingModule(){
        if(instance == null){
            instance = new TestingModule();
        }
        return instance;
    }

    @Override
    public String test() {
        return "Resultatele testarii";
    }
}
