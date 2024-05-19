package Proxy.ImageLoadingExample;

public class ProxyImage implements Image{
    private String diskLocation;
    private RealImage image;

    public ProxyImage(String diskLocation){
        this.diskLocation = diskLocation;
    }

    @Override
    public void display() {
        if(image == null){
            image = new RealImage(this.diskLocation);
        }
        this.image.display();
    }
}
