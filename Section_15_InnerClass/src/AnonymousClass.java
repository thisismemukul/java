interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {
        // Creating an instance of an anonymous class implementing the Greeting interface
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from the anonymous class!");
            }
        };

        // Calling the method of the anonymous class
        greeting.sayHello();
    }
}
