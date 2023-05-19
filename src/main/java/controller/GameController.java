package controller;

import view.InputView;

import java.util.List;

public class GameController {

    private final static String THREE_STRIKE = "3스트라이크";
    static ComputerController computerController = new ComputerController();


    public static void run() {
        List<Integer> answerList = computerController.getNumberList();

        inngin(answerList);

        gameover();

    }

    private static void gameover() {

        int gameoverNumber = InputView.gameOver();
        if (gameoverNumber == 1) {
            //재시작
            run();
        }
        if (gameoverNumber == 2) {
            return;
        }
    }

    private static void inngin(List<Integer> answerList) {
        try {
            List<Integer> usernumber = InputView.inputNumber();
            if (restart(BaseballController.checkNumber(usernumber, answerList))) {
            }

            inngin(answerList);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean restart(String checkString) {
        System.out.println(checkString);
        if (checkString == THREE_STRIKE) {
            return true;
        }
        return false;

    }
}
