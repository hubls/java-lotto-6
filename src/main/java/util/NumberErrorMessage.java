package util;

public enum NumberErrorMessage {
    NUMBER_IN_EMPTY("아무것도 입력하지 않았습니다."),
    NOT_A_NUMBER("숫자가 아닙니다."),
    OUT_OF_INT_RANGE("숫자의 범위를 초과했습니다."),
    INVALID_ZERO("0은 유효한 숫자가 아닙니다."),
    NEGATIVE_NUMBER("음수는 허용되지 않습니다."),
    NOT_DIVISIBLE_BY_THOUSANDS("1000으로 나눠지지 않습니다.");

    private final String message;

    NumberErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}