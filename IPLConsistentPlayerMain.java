import java.util.*;

/**
 * @author Sharmila
 */
public class IPLConsistentPlayerMain {
    public static void main(String[] args) throws ClassCastException,NullPointerException {

        Set<String> topScorersIplSeason13 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Set<String> topScorersIplSeason12 = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        int playersCount;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the top 5 scorers of IPL Season 13");
        for (playersCount=0;playersCount<5;playersCount++) {
            topScorersIplSeason13.add(scanner.nextLine());
        }

        System.out.println("Enter the top 5 scorers of IPL Season 12");
        for (playersCount=5;playersCount<10;playersCount++) {
            topScorersIplSeason12.add(scanner.nextLine());
        }

        if(topScorersIplSeason13.isEmpty() &&
                topScorersIplSeason12.isEmpty() ) {
            System.out.println("Invalid Input");
            System.exit(0);

        }else{
                boolean retainedConsistentPlayers = topScorersIplSeason13.retainAll(topScorersIplSeason12);
                if(retainedConsistentPlayers && !topScorersIplSeason13.isEmpty()) {
                    System.out.println("Consistent run scorers");
                    for (String players : topScorersIplSeason13) {
                        System.out.println(players);
                    }
                }else{
                    System.out.println("Retention not possible between irrelevant collection");
                    System.exit(0);
                }

        }
        scanner.close();

    }
}
