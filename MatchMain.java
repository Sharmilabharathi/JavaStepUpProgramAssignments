import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Sharmila
 */
public class MatchMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the match format\n"+
                "1. ODI\n"+
                "2. T20\n"+
                "3. Test");
        int matchFormat = scanner.nextInt();
        System.out.println("Enter the Current score");
        int currentScore = scanner.nextInt();
        System.out.println("Enter the current Over");
        int currentOver = scanner.nextInt();
        System.out.println("Enter the Target Score");
        int targetScore = scanner.nextInt();

        Match match;
        double reqRunRate;
        int ballsLeft;
        if(matchFormat==1){
            match = new ODIMatch();
            match.setCurrentScore(currentScore);
            match.setCurrentOver(currentOver);
            match.setTarget(targetScore);

            reqRunRate = BigDecimal.valueOf(match.calculateRunRate())
                    .setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();;
            System.out.println("reqRunRate:"+reqRunRate);
            ballsLeft = match.calculateBalls();
            match.display(reqRunRate,ballsLeft);

        }else if(matchFormat==2){
            match = new T20Match();
            match.setCurrentScore(currentScore);
            match.setCurrentOver(currentOver);
            match.setTarget(targetScore);

            reqRunRate = match.calculateRunRate();
            ballsLeft = match.calculateBalls();
            match.display(reqRunRate,ballsLeft);
        }else if(matchFormat==3){
            match = new TestMatch();
            match.setCurrentScore(currentScore);
            match.setCurrentOver(currentOver);
            match.setTarget(targetScore);

            reqRunRate = match.calculateRunRate();
            ballsLeft = match.calculateBalls();
            match.display(reqRunRate,ballsLeft);
        }else{
            System.out.println("Invalid MatchFormat");
        }

    }
}
