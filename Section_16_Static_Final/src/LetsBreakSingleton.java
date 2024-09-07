import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.ConcurrentModificationException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LetsBreakSingleton {

    /*
     * 1. Reflection
     * Solution - Reflection breaking law solution using runtime exception
     * 2.Serialization
     * Solution - implement read resolve method
     * 3.Cloning
     * Solution - throw new CloneNotSupportedException("Cannot clone a singleton object.");
     * */
    // Initialize the logger
    private static final Logger logger = Logger.getLogger(LetsBreakSingleton.class.getName());

    public static void main(String[] args) throws Exception, CloneNotSupportedException {
        try {
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson1 = LazySingletonCoffeeMachine.getSingletonCoffeeMachineInstance();

            System.out.println(lazySingletonCoffeeMachineForPerson1.hashCode());
            Constructor<LazySingletonCoffeeMachine> constructor = LazySingletonCoffeeMachine.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson2 = constructor.newInstance();

            System.out.println(lazySingletonCoffeeMachineForPerson2.hashCode());
            System.out.println("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson2));


            //2
            // Serialize the object
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            oos.writeObject(lazySingletonCoffeeMachineForPerson1);
            oos.close();

            System.out.println("Serialization Done.");
            // Deserialize the object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singleton.ser"));
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson3 = (LazySingletonCoffeeMachine) ois.readObject();
            ois.close();

            System.out.println(lazySingletonCoffeeMachineForPerson1.hashCode());
            System.out.println(lazySingletonCoffeeMachineForPerson3.hashCode());
            System.out.println("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson3));

            //3
            LazySingletonCoffeeMachine lazySingletonCoffeeMachineForPerson4 = (LazySingletonCoffeeMachine) lazySingletonCoffeeMachineForPerson1.clone();
            System.out.println(lazySingletonCoffeeMachineForPerson1.hashCode());
            System.out.println(lazySingletonCoffeeMachineForPerson4.hashCode());
            logger.log(Level.INFO,
                    "lazySingletonCoffeeMachineForPerson4: ",
                    lazySingletonCoffeeMachineForPerson4.hashCode());

            System.out.println("Are both instances the same? " + (lazySingletonCoffeeMachineForPerson1 == lazySingletonCoffeeMachineForPerson4));


        } catch (Exception e) {
            logger.log(Level.SEVERE, "An exception occurred: ", e);
        }
    }
}
