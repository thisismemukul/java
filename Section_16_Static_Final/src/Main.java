public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson1 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();
        LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson2 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();

        System.out.println(lazySingletonCoffeeMachineForPerson1.hashCode());
        System.out.println(lazySingletonCoffeeMachineForPerson2.hashCode());

        EagerSingletonCoffeeMachine eagerSingletonCoffeeMachineForPerson1 = EagerSingletonCoffeeMachine.getInstance();
        EagerSingletonCoffeeMachine eagerSingletonCoffeeMachineForPerson2 = EagerSingletonCoffeeMachine.getInstance();

        System.out.println(eagerSingletonCoffeeMachineForPerson1.hashCode());
        System.out.println(eagerSingletonCoffeeMachineForPerson2.hashCode());

    }
}