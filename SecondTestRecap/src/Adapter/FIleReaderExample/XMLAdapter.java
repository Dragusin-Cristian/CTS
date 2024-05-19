package Adapter.FIleReaderExample;

public class XMLAdapter implements DataReader{
    private XMLDataReader xmlDataReader;

    public XMLAdapter(XMLDataReader xmlDataReader) {
        this.xmlDataReader = xmlDataReader;
    }

    @Override
    public String readData() {
        return this.xmlDataReader.readXML();
    }
}
