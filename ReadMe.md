# Requirement

## We have an abstract class Player with name as an instance variable. There are 2 subclass Cricket Player and football player.
## We have a class Team which will add players as per the game, we should not be able to add cricket players to football team and vice versa.


    public abstract class Player {
        private String name;
    
        public Player(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    }


    public class FootballPlayer extends Player {
        public FootballPlayer(String name) {
            super(name);
        }
    }

    public class CricketPlayer extends Player {
        public CricketPlayer(String name) {
            super(name);
        }
    }
    
 # Team 
 
    import java.util.ArrayList;
    import java.util.List;
    
    public class Team {
        private String name;
        private List<Player> members = new ArrayList<>();
    
        public Team(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    
        public boolean addPlayer(Player player) {
            if (members.contains(player.getName())) {
                System.out.println(player.getName() + " already in the team..");
                return false;
            }
            members.add(player);
            System.out.println(player.getName() + " added to the team..");
            return true;
        }
    
        public int numberOfPlayers() {
            return this.members.size();
        }
    }
    
# Main method

        Player cricketPlayer = new CricketPlayer("sachin");
        Player footballPlayer = new FootballPlayer("Babu");

        Team india = new Team("India");
        india.addPlayer(cricketPlayer);
        india.addPlayer(footballPlayer);
        
        we are able to add new different kinds of player to the team.
