package controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BaseballController {
    private final static String BALL = "볼";
    private final static String STRIKE = "스트라이크";
    private final static String THREE_STRIKE = "3스트라이크";
    private final static String NOTHING = "낫싱";

    public static String checkNumber(List<Integer> usernumber, List<Integer> computerNumber) {

        int ball = checkball(usernumber, computerNumber);
        int strike = checkstrike(usernumber, computerNumber);
        ball -= strike;

        return checkresult(ball, strike);
    }


    private static String checkresult(int ball, int strike) {
        if (strike == 3) {
            return THREE_STRIKE;
        }
        if (ball == 0 && strike == 0) {
            return NOTHING;
        }
        if (ball != 0 && strike == 0) {
            return ball + BALL;
        }
        if (ball == 0 && strike != 0) {
            return strike + STRIKE;
        }
        return ball + BALL + strike + STRIKE;
    }

    private static int checkstrike(List<Integer> array1, List<Integer> array2) {
        int count = 0;

        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) == array2.get(i)) {
                count += 1;
            }
        }

        return count;
    }

    public static int checkball(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        int count = 0;

        for (Integer num : list2) {
            if (set1.contains(num)) {
                count++;
            }
        }

        return count;
    }


}