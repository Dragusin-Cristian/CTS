package Adapter.FIleReaderExample;

public class Main {
    public static void main(String[] args) {
        DataReader jsonAdapter = new JSONAdapter(new JSONDataReader());
        DataReader xmlAdapter = new XMLAdapter(new XMLDataReader());
        System.out.println(jsonAdapter.readData());
        System.out.println(xmlAdapter.readData());
    }
}