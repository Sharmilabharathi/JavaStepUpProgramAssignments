/**
 * @author Sharmila
 */
public abstract class Match {
    private int currentScore;
    private float currentOver;
    private int target;


    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public float getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(float currentOver) {
        this.currentOver = currentOver;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    abstract float calculateRunRate();
    abstract int calculateBalls();
    abstract void display(double reqRunRate, int balls);
}
