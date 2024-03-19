package ex2_Document;

import org.w3c.dom.Text;

interface Document {
    void open();
    void save();
}

class TextDocument implements Document{

    @Override
    public void open() {
        System.out.println("open text");
    }

    @Override
    public void save() {
        System.out.println("save text");
    }
}

class ImageDocument implements Document{

    @Override
    public void open() {
        System.out.println("open image");
    }

    @Override
    public void save() {
        System.out.println("save image");
    }
}

interface DocumentFactory {
    Document createDocument();
}
class TextDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

class ImageDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}


public class Main {
    public  static void main(String[] args){
        TextDocumentFactory textDocumentFactory = new TextDocumentFactory();
        Document textDocument = textDocumentFactory.createDocument();
        textDocument.open();
        textDocument.save();

        ImageDocumentFactory imageDocumentFactory = new ImageDocumentFactory();
        Document imageDocument = imageDocumentFactory.createDocument();
        imageDocument.open();
        imageDocument.save();
    }
}
