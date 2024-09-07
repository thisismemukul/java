public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson1 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();
        LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson2 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();

        System.out.println(lazySingletonCoffeeMachineForPerson1.hashCode());
        System.out.println(lazySingletonCoffeeMachineForPerson2.hashCode());
        lazySingletonCoffeeMachineForPerson1.brewCoffee("Espresso");
        lazySingletonCoffeeMachineForPerson1.steamMilk();
        lazySingletonCoffeeMachineForPerson1.serveCoffee();

        // Trying to create another instance (will return the same instance)
        lazySingletonCoffeeMachineForPerson2.brewCoffee("Latte");

        // Both machines are the same instance
        System.out.println("Are both machines the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson2));  // Outputs: true


        EagerSingletonCoffeeMachine eagerSingletonCoffeeMachineForPerson1 = EagerSingletonCoffeeMachine.getInstance();
        EagerSingletonCoffeeMachine eagerSingletonCoffeeMachineForPerson2 = EagerSingletonCoffeeMachine.getInstance();

        System.out.println(eagerSingletonCoffeeMachineForPerson1.hashCode());
        System.out.println(eagerSingletonCoffeeMachineForPerson2.hashCode());


        eagerSingletonCoffeeMachineForPerson1.brewCoffee("Latte");
        eagerSingletonCoffeeMachineForPerson1.steamMilk();
        eagerSingletonCoffeeMachineForPerson1.serveCoffee();
        eagerSingletonCoffeeMachineForPerson2.brewCoffee("Americano");

        System.out.println("Are both machines the same? " + (eagerSingletonCoffeeMachineForPerson1 == eagerSingletonCoffeeMachineForPerson2));

    }
}