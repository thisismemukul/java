class LazySingletonCoffeeMachine {
    private static LazySingletonCoffeeMachine lazySingletonCoffeeMachine;

    private LazySingletonCoffeeMachine() {
        System.out.println("Lazy Coffee machine is ready.");
    }

    public static LazySingletonCoffeeMachine getSingletonCoffeeMachineInstance() {
        if (lazySingletonCoffeeMachine == null) {
            lazySingletonCoffeeMachine = new LazySingletonCoffeeMachine();
        }
        return lazySingletonCoffeeMachine;
    }
    // Coffee Machine Methods
    public void brewCoffee(String type) {
        System.out.println("Brewing a cup of " + type + " coffee.");
    }

    public void steamMilk() {
        System.out.println("Steaming milk.");
    }

    public void serveCoffee() {
        System.out.println("Serving coffee.");
    }
}