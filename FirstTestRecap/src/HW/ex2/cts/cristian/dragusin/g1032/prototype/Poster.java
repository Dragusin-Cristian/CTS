package HW.ex2.cts.cristian.dragusin.g1032.prototype;

import HW.ex2.cts.cristian.dragusin.g1032.factory.IShow;

public class Poster implements IPoster{
    String  name;
    String location;
    String dateTime;

    public Poster(IShow show){
        this.name = show.getName();
        this.location = show.getLocation();
        this.dateTime = show.getDateTime();
        // more logic
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setShow(IShow show){
        this.name = show.getName();
        this.location = show.getLocation();
        this.dateTime = show.getDateTime();
    }

    private Poster(){}

    @Override
    public void print() {
        System.out.println(name + " " + location + " " + dateTime);
    }


    @Override
    public IPoster clone() {
        Poster clone = new Poster();
        clone.name = this.name;
        clone.location=  this.location;
        clone.dateTime = this.dateTime;
        return clone;
    }
}
