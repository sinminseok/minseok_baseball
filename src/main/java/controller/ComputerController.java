package controller;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerController {
    private final static int MIN_RANGE_NUM = 1;
    private final static int MAX_RANGE_NUM = 9;
    private final static int MAX_NUMBER_SIZE = 3;

    List<Integer> answerNumberList = new ArrayList<>();


    //랜덤 숫자 생성
    public List<Integer> getNumberList() {

        while (answerNumberList.size() < MAX_NUMBER_SIZE) {

            isNumberInAnswerNumberList(Randoms.pickNumberInRange(MIN_RANGE_NUM, MAX_RANGE_NUM));

        }

        return answerNumberList;

    }

    //중복 검증
    private void isNumberInAnswerNumberList(int number) {
        if (answerNumberList.contains(number)) {
            return;
        }
        answerNumberList.add(number);
    }
}
