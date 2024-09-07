import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LetsBreakSingleton {

    /*
       * There are several ways to break the Singleton pattern, even in well-designed implementations like your `LazySingletonCoffeeMachine`. Below are the common ways in which the Singleton pattern can be broken and how to mitigate them:
        ## Summary of Mitigations:
        1. **Reflection**: Throw an exception if the constructor is called more than once.
        2. **Serialization**: Use `readResolve()` to prevent creating new instances.
        3. **Cloning**: Disable cloning by throwing a `CloneNotSupportedException`.
        4. **Multithreading**: Ensure thread safety with proper synchronization or use patterns like Bill Pugh or Enum Singleton.
        5. **ClassLoader Issues**: Ensure the Singleton is managed properly in environments with custom classloaders.
     * 1. Reflection
     * Solution - Reflection breaking law solution using runtime exception
     * 2.Serialization
     * Solution - implement read resolve method
     * 3.Cloning
     * Solution - throw new CloneNotSupportedException("Cannot clone a singleton object.");
     */

    // Initialize the logger
    private static final Logger logger = Logger.getLogger(LetsBreakSingleton.class.getName());

    public static void main(String[] args) {
        try {
            // Test Reflection Attack
            logger.info("Starting Reflection Attack Test...");
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson1 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();
            logger.info("Hash code of instance obtained via getSingletonCoffeeMachineInstance(): " + lazySingletonCoffeeMachineForPerson1.hashCode());

            Constructor<LazySingletonCoffeeMachine> constructor = LazySingletonCoffeeMachine.class.getDeclaredConstructor();
            constructor.setAccessible(true); // Bypass private constructor
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson2 = constructor.newInstance();
            logger.info("Hash code of instance obtained via reflection: " + lazySingletonCoffeeMachineForPerson2.hashCode());
            logger.info("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson2));

            // Test Serialization Attack
            logger.info("Starting Serialization Attack Test...");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(lazySingletonCoffeeMachineForPerson1);
            oos.close();
            logger.info("Object serialized successfully to 'singleton.ser'.");

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson3 = (LazySingletonCoffeeMachine) ois.readObject();
            ois.close();
            logger.info("Object deserialized successfully from 'singleton.ser'.");

            logger.info("Hash code of instance obtained via deserialization: " + lazySingletonCoffeeMachineForPerson3.hashCode());
            logger.info("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson3));

            // Test Cloning Attack
            logger.info("Starting Cloning Attack Test...");
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson4 = (LazySingletonCoffeeMachine) lazySingletonCoffeeMachineForPerson1.clone();
            logger.info("Hash code of instance obtained via cloning: " + lazySingletonCoffeeMachineForPerson4.hashCode());
            logger.info("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson4));

        } catch (Exception e) {
            logger.log(Level.SEVERE, "An exception occurred during Singleton tests: ", e);
        }
    }
}
