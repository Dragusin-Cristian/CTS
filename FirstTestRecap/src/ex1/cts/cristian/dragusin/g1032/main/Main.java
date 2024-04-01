package ex1.cts.cristian.dragusin.g1032.main;

import ex1.cts.cristian.dragusin.g1032.builder.AGamingSystemBuilder;
import ex1.cts.cristian.dragusin.g1032.builder.IGamingSystem;
import ex1.cts.cristian.dragusin.g1032.builder.IGamingSystemBuilder;
import ex1.cts.cristian.dragusin.g1032.builder.PCEngineer;
import ex1.cts.cristian.dragusin.g1032.singleton.ITesingModule;
import ex1.cts.cristian.dragusin.g1032.singleton.TestingModule;

public class Main {
    public static void main(String[] args) {
        IGamingSystemBuilder builder = new AGamingSystemBuilder();
        PCEngineer engineer = new PCEngineer(builder);

        engineer.build();
        IGamingSystem system = engineer.getSystem();
        system.printConfiguration();

        ITesingModule testingModule = TestingModule.getTestingModule();
        System.out.println(testingModule.test());

        system.set
    }
}
