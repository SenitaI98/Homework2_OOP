package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {

    private ArrayList<Integer> listOfNumbers;


    public Numbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }


    public void addNumbers() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter number");
        int number = reader.nextInt();
        this.listOfNumbers.add(number);
    }

    public void addNumbersBasedOnUserInput() {
        Scanner reader = new Scanner(System.in);
        char yOrN;
        do {
            addNumbers();
            System.out.println("Do you wand to add another number? y/n");
            yOrN = reader.next().charAt(0);
        } while (yOrN == 'y');
        System.out.print("Your list --> ");
        printAllNumbers(this.listOfNumbers);
    }

    private void printAllNumbers(ArrayList<Integer> listOfNumbers) {
        for (int number : listOfNumbers) {
            System.out.print(number + " ");
        }
    }

    public void minValue() {
        System.out.println("\nMin value in ArrayList is: " + Collections.min(this.listOfNumbers));
    }

    public void maxValue() {
        System.out.println("Max value in ArrayList is: " + Collections.max(this.listOfNumbers));
    }

    void sumOfNumbersInArrayList() {
        int sum = 0;
        for (int element : this.listOfNumbers) {
            sum = sum + element;
        }
        System.out.println("Sum of numbers is: " + sum);
    }


    void isNumberPrime() {
        ArrayList<Integer> listOfNoPrimeNumbers = new ArrayList<>();
        for (Integer element : this.listOfNumbers) {
            for (int i = 2; i < element; i++) {
                if (element % i == 0) {
                    listOfNoPrimeNumbers.add(element);
                    break;
                }
            }
        }
        System.out.print("Not prime numbers: ");
        printAllNumbers(listOfNoPrimeNumbers);
        listOfPrimeNumbers(listOfNoPrimeNumbers);
    }

    private void listOfPrimeNumbers(ArrayList<Integer> listOfNoPrimeNumbers) {
        this.listOfNumbers.removeAll(listOfNoPrimeNumbers);
        System.out.print("\nPrime numbers: ");
        printAllNumbers(this.listOfNumbers);
    }
}
