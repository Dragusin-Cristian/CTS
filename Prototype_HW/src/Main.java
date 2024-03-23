
// Prototype is used for creating copies of a class
// Why use it: because creating a new object form scratch is resource consuming (time & space)


import java.util.ArrayList;
import java.util.Random;
class DocumentTemplate implements Cloneable {
    private String title;
    private String header;
    private String footer;
    private ArrayList<String> pages;

    public DocumentTemplate(String title) {
        this.title = title;
        this.header = "Default Header";
        this.footer = "Default Footer";
        this.pages = new ArrayList<>();
        System.out.println("Loading document template for " + title);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        pages.add("Page 1 content");
        pages.add("Page 2 content");
        System.out.println("Document template loaded.");
    }

    private DocumentTemplate() {
    }

    @Override
    public DocumentTemplate clone() {
        DocumentTemplate clone = new DocumentTemplate();
        clone.title = this.title;
        clone.header = this.header;
        clone.footer = this.footer;
        clone.pages = (ArrayList<String>) this.pages.clone();
        return clone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void addPage(String pageContent) {
        this.pages.add(pageContent);
    }
}

public class Main {
    public static void main(String[] args) {
//      without prototype:
//        DocumentTemplate document1 = new DocumentTemplate("Document 1");
//        DocumentTemplate document2 = new DocumentTemplate("Document 2");
//        DocumentTemplate document3 = new DocumentTemplate("Document 3");

//      with prototype
        DocumentTemplate prototype = new DocumentTemplate("Generic Document");

        DocumentTemplate document1 = prototype.clone();
        document1.setTitle("Document 1");
        document1.setHeader("Header for Document 1");

        DocumentTemplate document2 = prototype.clone();
        document2.setTitle("Document 2");
        document2.setFooter("Footer for Document 2");

        DocumentTemplate document3 = prototype.clone();
        document3.setTitle("Document 3");
        document3.addPage("Additional page for Document 3");

        System.out.println("Documents have been created based on the prototype.");
    }
}