package calculator.util;

public enum CalculatorConfig {
    DELIMITER("[,:]"),
    CUSTOM_START("//"),
    CUSTOM_END("\\\\n"),
    START_COMMENT("덧셈할 문자열을 입력해 주세요."),
    END_RESULT("결과 : %d");

    final String word;
    CalculatorConfig(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}
