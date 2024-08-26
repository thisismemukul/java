class OuterClass {
    private String outerField = "Outer field";

    // Nested Inner Class
    class InnerClass {
        private String innerField = "Inner field";

        // Method in the Inner Class
        void displayInner() {
            // Accessing the outer class field from the inner class
            System.out.println("Accessing from InnerClass:");
            System.out.println("Outer field: " + outerField);
            System.out.println("Inner field: " + innerField);
        }
    }

    // Method in the Outer Class to demonstrate accessing the inner class
    void displayOuter() {
        InnerClass inner = new InnerClass();  // Creating an instance of the inner class
        inner.displayInner();  // Calling the method in the inner class
    }
}

public class NestedInner {
    public static void main(String[] args) {
        // Creating an instance of the outer class
        OuterClass outer = new OuterClass();

        // Accessing the inner class method via the outer class
        outer.displayOuter();

        // Alternatively, creating an instance of the inner class directly using the outer class instance
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayInner();
    }
}
