package task3;

public class Main3 {
    public static void main(String[] args) throws Exception {
        CoffeeMachine coffeeMachine = new CoffeeMachine(1, 1, false);
        coffeeMachine.chooseCoffee();
        coffeeMachine.priceToPay();
    }
}
