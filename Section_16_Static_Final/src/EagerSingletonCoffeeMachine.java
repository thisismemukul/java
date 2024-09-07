public class EagerSingletonCoffeeMachine {
    private static EagerSingletonCoffeeMachine EAGER_SINGLETON_INSTANCE = new EagerSingletonCoffeeMachine();

    private EagerSingletonCoffeeMachine() {
    }

    public static EagerSingletonCoffeeMachine getInstance() {
        return EAGER_SINGLETON_INSTANCE;
    }
}
