package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;

public class Computer {

    private ArrayList<Integer> answer;

    public Computer() {
        this.answer = calculateAnswer();
    }

    public ArrayList<Integer> getAnswer() {
        return this.answer;
    }

    private static ArrayList<Integer> calculateAnswer() {

        ArrayList<Integer> nums = new ArrayList<>();

        while (nums.size() < 3) {
            int number = Randoms.pickNumberInRange(1, 9);
            if (!nums.contains(number)) {
                nums.add(number);
            }
        }

        return nums;
    }
}
