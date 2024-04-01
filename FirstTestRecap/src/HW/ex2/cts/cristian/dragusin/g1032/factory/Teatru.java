package HW.ex2.cts.cristian.dragusin.g1032.factory;

import java.util.ArrayList;

public class Teatru extends Show{
    String regizor;
    ArrayList<String> actori;

    Teatru(String name, String location, String dateTime, String regizor, ArrayList<String> actori){
        super(name, location, dateTime);
        this.regizor = regizor;
        this.actori = actori;
    }

    public String getRegizor() {
        return regizor;
    }

    public ArrayList<String> getActori() {
        return actori;
    }
}
