import java.io.Serial;
import java.io.Serializable;

class LazySingletonCoffeeMachine implements Serializable {
    private static LazySingletonCoffeeMachine lazySingletonCoffeeMachine;
//    private static boolean instanceCreated = false;
    private LazySingletonCoffeeMachine() {
//        if (instanceCreated) {
//            throw new RuntimeException("Cannot create instance via reflection. Use getSingletonCoffeeMachineInstance() method.");
//        }
//        instanceCreated = true;
        System.out.println("Lazy Coffee machine is ready.");
    }

    public static LazySingletonCoffeeMachine getSingletonCoffeeMachineInstance() {
        synchronized (LazySingletonCoffeeMachine.class) {
            if (lazySingletonCoffeeMachine == null) {
                lazySingletonCoffeeMachine = new LazySingletonCoffeeMachine();
            }
        }
        return lazySingletonCoffeeMachine;
    }
    @Serial
    public Object readResolve() {
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