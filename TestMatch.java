import java.math.BigDecimal;

/**
 * @author Sharmila
 */
public class TestMatch extends Match{

    @Override
    float calculateRunRate() {
        float requiredRuns = ((float) this.getTarget())-this.getCurrentScore();
        float oversLeft = 90-((int)this.getCurrentOver());
        return requiredRuns / oversLeft;
    }

    @Override
    int calculateBalls() {
        int ballsFaced=((int)this.getCurrentOver())*6;
        return 540-ballsFaced;
    }

    @Override
    void display(double reqRunRate, int balls) {
        BigDecimal requiredRuns = BigDecimal.valueOf(((float) this.getTarget())-this.getCurrentScore())
                .setScale(0, BigDecimal.ROUND_HALF_UP);
        System.out.println("Requirements:\n"+"Need "+requiredRuns+" runs in "+balls+" balls\n"+
                "Required RunRate:"+reqRunRate);
    }
}
