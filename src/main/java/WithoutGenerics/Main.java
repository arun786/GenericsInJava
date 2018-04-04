package WithoutGenerics;

/**
 * Created by Adwiti on 4/3/2018.
 */
public class Main {
    public static void main(String[] args) {

        Player cricketPlayer = new CricketPlayer("sachin");
        Player footballPlayer = new FootballPlayer("Babu");

        Team india = new Team("India");
        india.addPlayer(cricketPlayer);
        india.addPlayer(footballPlayer);

        System.out.println(india);
    }
}
