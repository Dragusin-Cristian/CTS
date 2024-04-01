package HW.prototype_diagram;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    private Map<String, Report> reports;
    public ReportGenerator(){
        this.reports = new HashMap<>();
    }

    public Report generateReport(String data, String format, String a ){
        Report report = new SalesReport();
        return report;
    }

}
