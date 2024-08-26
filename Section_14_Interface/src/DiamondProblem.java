interface A {
    default void someMethod() {
        System.out.println("Method from interface A");
    }
}

interface B extends A {
    @Override
    default void someMethod() {
        System.out.println("Method from interface B");
    }
}

interface C extends A {
    @Override
    default void someMethod() {
        System.out.println("Method from interface C");
    }
}

class D implements B, C {
    @Override
    public void someMethod() {
        // Resolving the diamond problem by explicitly choosing the implementation
        B.super.someMethod();  // Or C.super.someMethod();
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.someMethod();  // Outputs: "Method from interface B"
    }
}