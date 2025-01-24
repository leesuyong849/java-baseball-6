package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static baseball.calculator.calculateResult;
import static baseball.console.Input.AskThreeNum;
import static baseball.console.Output.printResult;
import static baseball.console.Output.printStartMessage;

public class Game {

    public void play() {

        Scanner scanner = new Scanner(System.in);

        printStartMessage();

        while (true) {
            //게임을 계속해야 하는가?
            Boolean flag = false;

            flag = doOneGame(scanner);

            if (flag) {
                break;
            }
        }
        scanner.close();

    }

    private static Boolean doOneGame(Scanner scanner) {

        //컴퓨터의 숫자 생성: 서로다른 3개의 수
        Computer computer = new Computer();

        //사용자로부터 입력받기
        int[] input = AskThreeNum(scanner);

        //결과를 저장할 곳
        Result result = calculateResult(input, computer.getAnswer());

        //결과출력
        printResult(result);

        return result.isGameOver();
    }



}
