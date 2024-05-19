package Proxy.ImageLoadingExample;

public class RealImage implements Image {
    private String diskLocation;

    public RealImage(String diskLocation){
        this.diskLocation = diskLocation;
        this.loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading from disk...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + this.diskLocation);
    }
}
