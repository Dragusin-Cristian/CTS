package Proxy.ImageLoadingExample;

public class Main {
    public static void main(String[] args) {
//        Image image = new ProxyImage("CAT.png");
//
//        image.display();
//        image.display();

//        Implementation without Proxy, which still works teh same, meaning that the current implementation is wrong, but you get the point:
//        Proxy is about caching

        Image image = new RealImage("CAT.png");

        image.display();
        image.display();

    }
}
