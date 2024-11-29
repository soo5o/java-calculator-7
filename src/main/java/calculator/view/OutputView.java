package calculator.view;

import static calculator.util.CalculatorConfig.END_RESULT;
import static calculator.util.CalculatorConfig.START_COMMENT;

public class OutputView {
    public void printStart(){
        System.out.println(START_COMMENT.getWord());
    }
    public void printEnd(int result){
        System.out.printf(END_RESULT.getWord(), result);
    }
    public void printError(String e){
        System.out.println(e);
    }
}
