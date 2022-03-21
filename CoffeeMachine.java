package task3;

import java.util.Scanner;

public class CoffeeMachine {
    int coffeeNumber;
    int coffeePrice;
    boolean enoughAmountOfGlasses;

    public CoffeeMachine(int coffeeNumber, int coffeePrice, boolean enoughAmountOfGlasses) {
        this.coffeeNumber = coffeeNumber;
        this.coffeePrice = coffeePrice;
        this.enoughAmountOfGlasses = enoughAmountOfGlasses;
    }

    static Scanner reader = new Scanner(System.in);

    public int chooseCoffee() {
        checkingTheAmountOfGlasses();
        System.out.println("Coffee options: \n1. Espresso \n2. Latte \n3. Cappuccino \n4. Ice coffee \n5. Mocha ");
        return reader.nextInt();
    }

    public int priceToPay() {
        System.out.println("Your coffee is: 3€ \nPlease input your money");
        System.out.println("You input: " + this.coffeePrice + "€");
        if (this.coffeePrice >= 3) {
            inputEnoughMoneyToPay();
        } else {
            inputNotEnoughMoneyToPay();
        }
        return this.coffeePrice;
    }

    private void inputEnoughMoneyToPay() {
        System.out.println("~Your coffee is being prepared~");
    }

    private void inputNotEnoughMoneyToPay() {
        System.out.println("You coffee is more expensive");
    }

    private void checkingTheAmountOfGlasses() {
        if (this.enoughAmountOfGlasses) {
            System.out.println("You can try best coffee in town");
        }
        if (!this.enoughAmountOfGlasses) {
            System.out.println("COFFEE MACHINE DEFECTIVE!");
            System.exit(1);
        }
    }
}
