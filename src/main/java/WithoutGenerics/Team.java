package WithoutGenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adwiti on 4/3/2018.
 */
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Team{");
        sb.append("name='").append(name).append('\'');
        sb.append(", members=").append(members);
        sb.append('}');
        return sb.toString();
    }
}
