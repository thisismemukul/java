class OuterClass1 {
    private String outerField = "Outer field";

    // Method containing a local inner class
    void displayOuter() {
        // Local inner class defined within a method
        class LocalInnerClass {
            private String innerField = "Inner field";

            void displayInner() {
                // Accessing the outer class field from the local inner class
                System.out.println("Accessing from LocalInnerClass:");
                System.out.println("Outer field: " + outerField);
                System.out.println("Inner field: " + innerField);
            }
        }

        // Creating an instance of the local inner class within the method
        LocalInnerClass inner = new LocalInnerClass();
        inner.displayInner();  // Calling the method of the local inner class
    }
}

public class LocalInner {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass1 outer = new OuterClass1();

        // Calling the method that contains the local inner class
        outer.displayOuter();
    }
}
