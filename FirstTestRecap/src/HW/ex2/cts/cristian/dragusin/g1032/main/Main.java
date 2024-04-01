package HW.ex2.cts.cristian.dragusin.g1032.main;

import HW.ex2.cts.cristian.dragusin.g1032.factory.IShow;
import HW.ex2.cts.cristian.dragusin.g1032.factory.ShowFactory;
import HW.ex2.cts.cristian.dragusin.g1032.prototype.IPoster;
import HW.ex2.cts.cristian.dragusin.g1032.prototype.Poster;

public class Main {
    public static void main(String[] args) {
        IShow teatru = ShowFactory.createShow("Teatru");
        teatru.printDetails();

        IShow concert = ShowFactory.createShow("Concert");
        concert.printDetails();

        IShow standup = ShowFactory.createShow("StandUp");
        standup.printDetails();

        IPoster teatruPoster = new Poster(teatru);
        teatruPoster.print();

        IPoster concertPoster = teatruPoster.clone();
        concertPoster.setShow(concert);
        concertPoster.print();

        IPoster standupPoster = teatruPoster.clone();
        standupPoster.setShow(standup);
        standupPoster.print();
    }

}
