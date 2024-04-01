package HW.ex2.cts.cristian.dragusin.g1032.factory;

import java.util.ArrayList;

public class Concert extends Show{
    String gen;
    ArrayList<String> artisti;

    Concert(String name, String location, String dateTime, String gen, ArrayList<String> artisti){
        super(name, location, dateTime);
        this.gen = gen;
        this.artisti = artisti;
    }

    public String getGen() {
        return gen;
    }

    public ArrayList<String> getArtisti() {
        return artisti;
    }
}
