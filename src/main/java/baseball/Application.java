package baseball;

import java.util.Scanner;

import static baseball.console.Input.AskOneMoreGame;
import static baseball.console.Output.printEndGame;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true){
            game.play(scanner);
            if (AskOneMoreGame(scanner)) {
                continue;  // 게임을 다시 실행
            } else {
                printEndGame();
                break;  // 루프 종료
            }
        }

        scanner.close();
    }
}
