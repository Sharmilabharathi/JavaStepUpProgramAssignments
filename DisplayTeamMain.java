import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sharmila
 */
public class DisplayTeamMain {
    public static void main(String[] args){

        System.out.println("Enter the number of input elements:");
        int noOfInput = new Scanner(System.in).nextInt();
        int playersCount, playersList;
        String teamNameWithPlayers=null;
        List<String> playersListWithTeam=new ArrayList<>();

        System.out.println("Enter the team name with the players name in the format of TeamName|PlayerName:");
        Scanner scanner = new Scanner(System.in);
        for (playersCount=0; playersCount<=noOfInput;playersCount++) {
            teamNameWithPlayers = scanner.nextLine();
            playersListWithTeam.add(playersCount,teamNameWithPlayers);
        }
        String teamName,playerName;
        Pattern pattern;
        Matcher patternCheck;
        Team team = new Team();
        Player player = new Player();
        List<Player> players = new ArrayList<>();

        for (String playersTeam:playersListWithTeam){
            pattern = Pattern.compile("\\|");
            patternCheck = pattern.matcher(playersTeam);
            if(patternCheck.find()) {
                teamName = playersTeam.split("\\|")[0];
                playerName =  playersTeam.split("\\|")[1];

                if(team.getName()==null){
                    team.setName(teamName);
                    team.addPlayer(playerName);
                }else if(team.getName().equalsIgnoreCase(teamName)){
                    System.out.println("TeamName:"+team.getName());
                    while (team.getName().equalsIgnoreCase(teamName)) {
                        player.setName(playerName);
                        players.add(player);
                        team.setPlayersListData(players);
                        System.out.println("Players List:"+team.getPlayerList());
                    }

                }else{
                    System.out.println("Invalid");
                    System.exit(0);
                }

            }else{
                   System.out.println("Invalid Input");
                   System.exit(0);
            }
        }



        scanner.close();

    }
}
