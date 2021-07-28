package src;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sharmila
 */
public class DisplayTeamMain {
    public static void main(String[] args){

        int playersCount;
        String teamNameWithPlayers,teamName,playerName;
        List<String> playersListWithTeam=new ArrayList<>();
        MultiValuedMap<String,String> teamWithPlayerMap = new ArrayListValuedHashMap<>();
        Pattern pattern;
        Matcher patternCheck;
        Team team = new Team();

        System.out.println("Enter the number of input elements:");
        int noOfInput = new Scanner(System.in).nextInt();

        System.out.println("Enter the team name with the players name in the format of TeamName|PlayerName:");
        Scanner scanner = new Scanner(System.in);
        for (playersCount=0; playersCount<noOfInput;playersCount++) {
            teamNameWithPlayers = scanner.nextLine();
            playersListWithTeam.add(playersCount,teamNameWithPlayers);
        }

        for (String playersTeam:playersListWithTeam){
            pattern = Pattern.compile("\\|");
            patternCheck = pattern.matcher(playersTeam);
            if(patternCheck.find()) {
                teamName = playersTeam.split("\\|")[0];
                playerName =  playersTeam.split("\\|")[1];
                teamWithPlayerMap.put(teamName,playerName);
            }else{
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }


        System.out.println("Team and Players in ascending order");
        List<String> teamKeyList = new ArrayList<>(teamWithPlayerMap.keySet());
        List<String> playersNameList;
        Collections.sort(teamKeyList);
        for (String teamNameKey:teamKeyList)
        {
            System.out.println(teamNameKey);
            team.setName(teamNameKey);
            if(teamWithPlayerMap.containsKey(teamNameKey)){
                playersNameList = (List<String>)teamWithPlayerMap.get(teamNameKey);
                Collections.sort(playersNameList);
                for(String players:playersNameList){
                    team.addPlayer(players);
                    for(Player playersSameTeam:team.getPlayerList()){
                        System.out.println("--"+playersSameTeam.getName());
                    }
                }

            }
        }



    }
}
