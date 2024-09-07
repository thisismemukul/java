class LazySingletonCoffeeMachine {
    private static LazySingletonCoffeeMachine lazySingletonCoffeeMachine;

    private LazySingletonCoffeeMachine() {
    }

    public static LazySingletonCoffeeMachine getSingletonCoffeeMachineInstance() {
        if (lazySingletonCoffeeMachine == null) {
            lazySingletonCoffeeMachine = new LazySingletonCoffeeMachine();
        }
        return lazySingletonCoffeeMachine;
    }
}