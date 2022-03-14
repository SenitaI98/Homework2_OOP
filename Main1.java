package task1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers( new ArrayList<>());
        numbers.whileLoopAddNumbers();
        System.out.println("\nMin value in ArrayList is: " + numbers.listOfNumbers.get(numbers.minValue()));
        System.out.println("Max value in ArrayList is: " + numbers.listOfNumbers.get(numbers.maxValue()));
        numbers.sumOfNumbersInArrayList();
        numbers.isNumberPrime();

    }
}
