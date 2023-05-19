package view;

import camp.nextstep.edu.missionutils.Console;
import verification.UserVerification;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    private final static String INPUTNUMBER = "숫자를 입력해세요";
    private final static String GAMEOVER_STRING = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final static int RESTART = 1;
    private final static int GAMEOVER = 2;

    public static List<Integer> inputNumber() {
        List<Integer> userNumberList = new ArrayList<>();
        System.out.println(INPUTNUMBER);
        String userNumber = Console.readLine();

        try {

            UserVerification.verificationNumber(userNumber);

            UserVerification.verificationNumberList(convertList(userNumber));

        } catch (IllegalArgumentException e) {
            return inputNumber();
        }

        return userNumberList;
    }

    private static List<Integer> convertList(String userNumber) {
        List<Integer> userNumberList = new ArrayList<>();
        if (userNumber.length() != 3) {
            new IllegalArgumentException();
        }
        for (int i = 0; i < 3; i++) {
            userNumberList.add(Integer.parseInt(userNumber.substring(i, i + 1)));
        }
        return userNumberList;
    }

    public static int gameOver() {
        System.out.println(GAMEOVER_STRING);
        int gameover = Integer.parseInt(Console.readLine());
        if (gameover == GAMEOVER) {
            return GAMEOVER;
        }
        return RESTART;
    }


}
