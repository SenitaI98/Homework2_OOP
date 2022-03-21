package task1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers( new ArrayList<>());
        numbers.addNumbersBasedOnUserInput();
        numbers.minValue();
        numbers.maxValue();
        numbers.sumOfNumbersInArrayList();
        numbers.isNumberPrime();

    }
}
