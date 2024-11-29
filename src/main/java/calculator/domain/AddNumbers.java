package calculator.domain;

import java.util.List;

public class AddNumbers {
    private int sum;
    public AddNumbers(List<Integer> numbers){
        for(Integer number:numbers){
            sum += number;
        }
    }

    public int getSum() {
        return sum;
    }
}
