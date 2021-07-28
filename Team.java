package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sharmila
 */
public class Team {
    private String name;
    private List<Player> playersListData;

    public Team(){}
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayersListData() {
        return playersListData;
    }

    public void setPlayersListData(List<Player> playersListData) {
        this.playersListData = playersListData;
    }

    public void addPlayer(String playerName){
        List<Player> players = new ArrayList<>();
        Player player = new Player();
        player.setName(playerName);
        players.add(player);
        this.setPlayersListData(players);
    }

    public List<Player> getPlayerList(){
        return this.getPlayersListData().stream().sorted().collect(Collectors.toList());
    }
}
