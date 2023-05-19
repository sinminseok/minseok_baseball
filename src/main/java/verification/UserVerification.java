package verification;

import java.util.List;

public class UserVerification {
    private final static int NUMBER_SIZE = 3;

    public static boolean verificationNumber(String usernnumber) throws IllegalArgumentException {
        if (usernnumber.length() != NUMBER_SIZE) {
            System.out.println("3자리 숫자를 입력해주세요");
            throw new IllegalArgumentException();
        }
        return false;
    }

    public static boolean verificationNumberList(List<Integer> usernumber) throws IllegalArgumentException {
        if (usernumber.size() != usernumber.stream().distinct().count()) {
            System.out.println("중복된 요소가 있습니다.");
            throw new IllegalArgumentException("중복된 요소가 있습니다.");
        }
        return false;

    }
}
