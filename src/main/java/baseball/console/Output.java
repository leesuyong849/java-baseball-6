package baseball.console;

import baseball.Result;

public class Output {

    public static void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printAskThreeNum() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public static void printResult(Result result) {

        int strike = result.getStrikes();
        int ball = result.getBalls();

        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else {
            System.out.print(ball != 0 ? ball + "볼" : "");

            System.out.println(strike != 0 ? strike + "스트라이크" : "");

            System.out.println("");
        }
    }
}
