import java.math.BigDecimal;

/**
 * @author Sharmila
 */
public class ODIMatch extends Match{
    @Override
    float calculateRunRate() {
        float requiredRuns = ((float) this.getTarget())-this.getCurrentScore();
        float oversLeft = 50-((int)this.getCurrentOver());
        return requiredRuns / oversLeft;
    }

    @Override
    int calculateBalls() {
        int ballsFaced=((int)this.getCurrentOver())*6;
        return 300-ballsFaced;
    }

    @Override
    void display(double reqRunRate, int balls) {

        BigDecimal requiredRuns = BigDecimal.valueOf(((float) this.getTarget())-this.getCurrentScore())
                .setScale(0, BigDecimal.ROUND_CEILING);
        System.out.println("Requirements:\n"+"Need "+requiredRuns+" runs in "+balls+" balls\n"+
                "Required RunRate:"+reqRunRate);
    }
}
