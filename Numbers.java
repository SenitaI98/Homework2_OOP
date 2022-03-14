package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {

    ArrayList<Integer> listOfNumbers;


    public Numbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }


    public void addNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = reader.nextInt();
        listOfNumbers.add(number);
    }

    public void whileLoopAddNumbers() {
        Scanner reader = new Scanner(System.in);
        char yOrN;
        do {
            addNumbers();
            System.out.println("Do you wand to add another number? y/n");
            yOrN = reader.next().charAt(0);
        } while (yOrN == 'y');
        System.out.print("Your list --> ");
        forLoop(listOfNumbers);
    }

    private void forLoop(ArrayList<Integer> listOfNumbers) {
        for (int number : listOfNumbers) {
            System.out.print(number + " ");
        }
    }

    public int minValue() {
        return listOfNumbers.indexOf(Collections.min(listOfNumbers));
    }

    public int maxValue() {
        return listOfNumbers.indexOf(Collections.max(listOfNumbers));
    }

    void sumOfNumbersInArrayList() {
        int sum = 0;
        for (int element : listOfNumbers) {
            sum = sum + element;
        }
        System.out.println("Sum of numbers is: " + sum);
    }


    void isNumberPrime() {
        ArrayList<Integer> listOfNoPrimeNumbers = new ArrayList<>();
        for (Integer element : listOfNumbers) {
            for (int i = 2; i < element; i++) {
                if (element % i == 0) {
                    listOfNoPrimeNumbers.add(element);
                    break;
                }
            }
        }
        System.out.print("Not prime numbers: ");
        forLoop(listOfNoPrimeNumbers);
        listOfPrimeNumbers(listOfNoPrimeNumbers);
    }

    private void listOfPrimeNumbers(ArrayList<Integer> listOfNoPrimeNumbers) {
        listOfNumbers.removeAll(listOfNoPrimeNumbers);
        System.out.print("\nPrime numbers: ");
        forLoop(listOfNumbers);
    }
}
