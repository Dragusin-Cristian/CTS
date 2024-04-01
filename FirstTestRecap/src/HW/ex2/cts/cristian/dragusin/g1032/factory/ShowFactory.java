package HW.ex2.cts.cristian.dragusin.g1032.factory;

import java.util.ArrayList;

public class ShowFactory {
    public static IShow createShow(String type){
        ArrayList artisti = new ArrayList<String>();
        artisti.add("Artist A");
        artisti.add("Artist B");
        artisti.add("inca un artist");
        if ("Concert".equalsIgnoreCase(type)){

            return new Concert("Concert show", "Arena nush care","2.04.2024", "Muzica populara", artisti);
        }
        if("Teatru".equalsIgnoreCase(type)){
            return new Teatru("Teatru show", "la teatru","2.04.2024", "nush cine", artisti);
        }
        if ("StandUp".equalsIgnoreCase(type)){
            return new StandUp("Standup show", "la standup","2.04.2024", true, artisti);
        }
        throw new RuntimeException("Wrong type passed");
    }
}
