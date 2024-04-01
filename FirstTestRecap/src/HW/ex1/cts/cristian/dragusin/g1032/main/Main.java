package HW.ex1.cts.cristian.dragusin.g1032.main;

import HW.ex1.cts.cristian.dragusin.g1032.builder.AGamingSystemBuilder;
import HW.ex1.cts.cristian.dragusin.g1032.builder.IGamingSystem;
import HW.ex1.cts.cristian.dragusin.g1032.builder.IGamingSystemBuilder;
import HW.ex1.cts.cristian.dragusin.g1032.builder.PCEngineer;
import HW.ex1.cts.cristian.dragusin.g1032.singleton.ITesingModule;
import HW.ex1.cts.cristian.dragusin.g1032.singleton.TestingModule;

public class Main {
    public static void main(String[] args) {
        IGamingSystemBuilder builder = new AGamingSystemBuilder();
        PCEngineer engineer = new PCEngineer(builder);

        engineer.build();
        IGamingSystem system = engineer.getSystem();
        system.printConfiguration();

        ITesingModule testingModule = TestingModule.getTestingModule();
        System.out.println(testingModule.test());

    }
}
