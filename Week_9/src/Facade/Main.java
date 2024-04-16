package Facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade("amp", "tuner", "dvd", "projection", "lights");
        homeTheaterFacade.watchMovie("Some movie");
        homeTheaterFacade.endMovie();
    }
}
