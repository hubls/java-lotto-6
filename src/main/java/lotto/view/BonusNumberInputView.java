package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.util.NumberErrorMessage;
import lotto.util.NumberValidator;

public class BonusNumberInputView {
    private static final String BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public int getInput() {

        while (true) {
            System.out.println(BONUS_NUMBER_MESSAGE);
            String bonusNumber = Console.readLine();

            try {
                NumberValidator.validateBonusNumber(bonusNumber);
                return Integer.parseInt(bonusNumber);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}