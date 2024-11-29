package calculator.util;

import java.util.Arrays;
import java.util.List;

import static calculator.message.ErrorMessage.INVALID_DELIMITER;
import static calculator.message.ErrorMessage.INVALID_MINUS;
import static calculator.util.CalculatorConfig.*;

public class SplitNumber {
    private static List<Integer> tmpList;
    public static List<Integer> splitNumber(String input){
        if (input.startsWith(CUSTOM_START.getWord())){
            customDelimiter(input.substring(2));
            return tmpList;
        }
        regularDelimiter(input);
        return tmpList;
    }
    private static void customDelimiter(String input){
        String customDelimiter = input.split(CUSTOM_END.getWord())[0];
        String customNumbers = input.split(CUSTOM_END.getWord())[1];
        try {
            tmpList = Arrays.stream(customNumbers.split(customDelimiter)).map(Integer::parseInt).toList();
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(INVALID_DELIMITER.getMessage());
        }
        validateNaturalNumber();
    }
    private static void regularDelimiter(String input){
        try {
            tmpList = Arrays.stream(input.split(DELIMITER.getWord())).map(Integer::parseInt).toList();
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException(INVALID_DELIMITER.getMessage());
        }
        validateNaturalNumber();
    }
    private static void validateNaturalNumber(){
        for(Integer num: tmpList){
            if (num<=0){
                throw new IllegalArgumentException(INVALID_MINUS.getMessage());
            }
        }
    }
}
