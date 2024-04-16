package Facade;

public class HomeTheaterFacade {
    private String amp;
    private String tuner;
    private String dvd;
    private String projection;
    private String lights;

    public HomeTheaterFacade(String amp, String tuner, String dvd, String projection, String lights) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projection = projection;
        this.lights = lights;
    }

    void watchMovie(String movie){
        System.out.println("Getting ready to watch a movie");
        // complex steps system
    }

    void endMovie(){
        System.out.println("Finished watching the movie");
        // complex steps system
    }
}
