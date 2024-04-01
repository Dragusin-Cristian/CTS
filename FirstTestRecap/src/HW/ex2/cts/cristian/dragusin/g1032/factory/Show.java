package HW.ex2.cts.cristian.dragusin.g1032.factory;

public class Show implements  IShow{
    String name;
    String location;
    String dateTime;

    Show(String name, String location, String dateTime){
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public String getDateTime() {
        return this.dateTime;
    }

    @Override
    public void printDetails() {
        System.out.println("Teatru{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", dateTime='" + dateTime + '\'' +
                '}');
    }
}
