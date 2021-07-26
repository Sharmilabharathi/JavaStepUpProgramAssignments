import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Sharmila
 */
public class IPLConsitentPlayerMain {
    public static void main(String[] args) throws IndexOutOfBoundsException {

        List<String> topScorersIplSeason13 = new ArrayList<>();
        List<String> topScorersIplSeason12 = new ArrayList<>();
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
        scanner.close();

        System.out.println("Consistent run scorers");
        topScorersIplSeason13.retainAll(topScorersIplSeason12);
        for (String players:topScorersIplSeason13) {
            System.out.println(players);
        }




    }
}
