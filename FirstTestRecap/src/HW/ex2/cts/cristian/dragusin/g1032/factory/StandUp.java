package HW.ex2.cts.cristian.dragusin.g1032.factory;

import java.util.ArrayList;

public class StandUp extends Show{
    boolean licentios;
    ArrayList<String> comedianti;

    StandUp(String name, String location, String dateTime, boolean licentios, ArrayList<String> artisti){
        super(name, location, dateTime);
        this.licentios = licentios;
        this.comedianti = artisti;
    }

    public boolean getLicentios() {
        return licentios;
    }

    public ArrayList<String> getComedianti() {
        return comedianti;
    }
}
