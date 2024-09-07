public class EagerSingletonCoffeeMachine {
    private static EagerSingletonCoffeeMachine EAGER_SINGLETON_INSTANCE = new EagerSingletonCoffeeMachine();

    private EagerSingletonCoffeeMachine() {
        System.out.println("Eager Coffee Machine is ready.");
    }

    public static EagerSingletonCoffeeMachine getInstance() {
        return EAGER_SINGLETON_INSTANCE;
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
