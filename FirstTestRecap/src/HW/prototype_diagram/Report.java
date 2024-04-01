package HW.prototype_diagram;

public interface Report extends Cloneable {
    public void generateReport();
    public void setData(String data);
    public void setFormat(String format);
    public Report clone();
}
