class OuterClass3 {
    private static String outerStaticField = "Outer static field";
    private String outerInstanceField = "Outer instance field";

    // Static nested class
    static class StaticNestedClass {
        private String nestedField = "Static nested field";

        // Method in the static nested class
        void display() {
            // Accessing the outer class's static field
            System.out.println("Accessing from StaticNestedClass:");
            System.out.println("Outer static field: " + outerStaticField);
            System.out.println("Nested field: " + nestedField);
            // Cannot access outerInstanceField directly
            // System.out.println("Outer instance field: " + outerInstanceField); // Error
        }
    }
}

public class StaticInnerClass {

    public static void main(String[] args) {
        // Creating an instance of the static nested class
        OuterClass3.StaticNestedClass nested = new OuterClass3.StaticNestedClass();
        nested.display();
    }

}
