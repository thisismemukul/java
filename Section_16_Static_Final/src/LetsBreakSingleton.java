import java.lang.reflect.Constructor;
import java.util.ConcurrentModificationException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LetsBreakSingleton {

    /*
     * 1. Reflection
     *
     *
     *
     *
     * */
    // Initialize the logger
    private static final Logger logger = Logger.getLogger(LetsBreakSingleton.class.getName());

    public static void main(String[] args) {
        try {
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson1 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();

            System.out.println(lazySingletonCoffeeMachineForPerson1.hashCode());
            Constructor<LazySingletonCoffeeMachine> constructor = LazySingletonCoffeeMachine.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson2 = constructor.newInstance();

            System.out.println(lazySingletonCoffeeMachineForPerson2.hashCode());
            System.out.println("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson2));

        } catch (Exception e) {
            logger.log(Level.SEVERE, "An exception occurred: ", e);
        }
    }
}
