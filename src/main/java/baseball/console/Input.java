package baseball.console;

import java.util.Scanner;

import static baseball.console.Output.printAskThreeNum;

public class Input {

    public static int[] AskThreeNum(Scanner scanner) {

        int[] num = new int[3];

        while (true) {
            printAskThreeNum();
            String input = scanner.nextLine();

            //입력된 값이 숫자로 변환가능한지 확인
            validateinputIntThree(input);

            // 3자리 숫자로 변환
            int number = Integer.parseInt(input);
            num[0] = number / 100;          // 백의 자리
            num[1] = (number / 10) % 10;     // 십의 자리
            num[2] = number % 10;            // 일의 자리

            //각 숫자가 다른 숫자인지 확인
            validateInputDistinct(num);

            break;
        }

        return num;
    }

    public static Boolean AskOneMoreGame() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        validateinputIntOne(input);
        int parseInt = Integer.parseInt(input);

        if (parseInt == 1) {
            return true;
        } else if (parseInt == 2) {
            return false;
        } else {
            throw new IllegalArgumentException("입력되는 숫자는 1 또는 2 입니다");
        }


    }

    private static void validateInputDistinct(int[] num) {
        if (num[0] == num[1] || num[0] == num[2] || num[1] == num[2]) {
            throw new IllegalArgumentException("입력된 숫자에 중복이 있습니다. 서로 다른 숫자를 입력하세요.");
        }
    }

    private static void validateinputIntThree(String input) {
        if (!input.matches("\\d{3}")) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다. ");
        }
    }
    private static void validateinputIntOne(String input) {
        if (!input.matches("\\d{1}")) {
            throw new IllegalArgumentException("올바르지 않은 입력입니다. ");
        }
    }
}
