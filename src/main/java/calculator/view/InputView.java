package calculator.view;

import calculator.util.SplitNumber;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    public List<Integer> inputNumber(){
        return SplitNumber.splitNumber(Console.readLine());
    }
}
