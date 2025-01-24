package baseball;

import static baseball.console.Input.AskOneMoreGame;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Game game = new Game();

        while (true){
            game.play();
            if (AskOneMoreGame()) {
                continue;  // 게임을 다시 실행
            } else {
                break;  // 루프 종료
            }
        }
    }
}
