package baseball;

import java.util.ArrayList;

public class calculator {

    public static Result calculateResult(int[] input, ArrayList<Integer> answer) {
        int ball = 0;
        int strike = 0;

        //판단하기
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (answer.get(i) == input[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }

        return new Result(ball , strike);
    }

}
