package calculator.message;

public enum ErrorMessage {
    INVALID_MINUS("[ERROR] 자연수 값만 입력해주십시오."),
    INVALID_DELIMITER("[ERROR] 구분자를 확인해주십시오.");
    final String message;
    ErrorMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }
}
