package calculator.controller;

import calculator.domain.AddNumbers;
import calculator.view.InputView;
import calculator.view.OutputView;

import java.util.List;

public class CalculatorController {
    private final InputView inputView;
    private final OutputView outputView;
    public CalculatorController(){
        inputView = new InputView();
        outputView = new OutputView();
    }
    public void run(){
        List<Integer> numbers = getNumbers();
        AddNumbers addNumbers = new AddNumbers(numbers);
        outputView.printEnd(addNumbers.getSum());
    }
    private List<Integer> getNumbers(){
        while(true){
            try{
                outputView.printStart();
                return inputView.inputNumber();
            }catch (IllegalArgumentException e){
                outputView.printError(e.getMessage());
            }
        }
    }
}
