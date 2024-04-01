package HW.prototype_diagram;

public class SalesReport implements Report{
    private String format;
    private String data;

    public SalesReport(){}
    @Override
    public void generateReport() {}

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public Report clone() {
        Report clone = new SalesReport();
        clone.setData(this.data);
        clone.setFormat(this.format);
        return clone;
    }
}
