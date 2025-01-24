package baseball;

public class Result {

    private int ball;
    private int strike;

    public Result(int ball, int strike) {
        this.ball = ball;
        this.strike = strike;
    }

    public int getStrikes() {
        return strike;
    }

    public int getBalls() {
        return ball;
    }

    public boolean isGameOver() {
        if (strike == 3) {
            return true;
        } else {
            return false;
        }
    }
}
