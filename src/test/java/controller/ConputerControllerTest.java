package controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ConputerControllerTest {

    ComputerController computerController;

    @BeforeEach
    void setUp(){
        computerController = new ComputerController();
    }

    @Test
    @DisplayName("랜덤숫자생성 테스트")
    void 랜덤숫자생성(){
       computerController.getNumberList();

    }
}
