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
