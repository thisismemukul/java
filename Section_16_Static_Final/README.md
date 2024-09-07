
# Java: Understanding `static` and `final` Keywords

## Table of Contents

- [Introduction](#introduction)
- [The `static` Keyword](#the-static-keyword)
  - [Static Variables](#static-variables)
  - [Static Methods](#static-methods)
  - [Static Nested Classes](#static-nested-classes)
- [The `final` Keyword](#the-final-keyword)
  - [Final Variables](#final-variables)
  - [Final Methods](#final-methods)
  - [Final Classes](#final-classes)
- [Differences between `static` and `final`](#differences-between-static-and-final)
- [Examples](#examples)
- [Conclusion](#conclusion)

---

## Introduction

In Java, `static` and `final` are two important keywords used in various contexts to control behavior, memory management, and restrictions. Understanding the differences between these keywords is essential for writing clean, optimized, and maintainable Java code.

---

## The `static` Keyword

### What is `static`?

The `static` keyword in Java is used for memory management. It allows you to define class-level variables and methods that are shared among all instances of the class. A `static` member belongs to the class itself rather than any specific object.

### 1. Static Variables

A static variable is shared among all instances of a class. This ensures that any changes made to the static variable affect all objects.

**Example:**

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        new Counter(); // Output: Count: 1
        new Counter(); // Output: Count: 2
        new Counter(); // Output: Count: 3
    }
}
```

In this example, the `count` variable is shared across all instances of the `Counter` class.

### 2. Static Methods

A static method belongs to the class rather than to any specific instance. It can only access static members of the class (variables or methods).

**Example:**

```java
class Utility {
    static void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Utility.printMessage("Hello, world!");
    }
}
```

Here, the `printMessage` method is static and is called directly via the class name.

### 3. Static Nested Classes

A static nested class is a class that is defined within another class and marked as `static`. Static nested classes can access the outer class’s static fields and methods, but they cannot access instance members of the outer class.

**Example:**

```java
class Outer {
    static class Nested {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        nested.display();
    }
}
```

---

## The `final` Keyword

### What is `final`?

The `final` keyword in Java is used to create constants, prevent method overriding, and restrict inheritance. Once something is marked `final`, its value or behavior cannot be changed.

### 1. Final Variables

A `final` variable is a constant. Once initialized, its value cannot be modified.

**Example:**

```java
class Constants {
    final int MAX_VALUE = 100;

    void display() {
        System.out.println("Max Value: " + MAX_VALUE);
    }
}
```

In this example, `MAX_VALUE` is a `final` variable, meaning it cannot be reassigned after initialization.

### 2. Final Methods

A `final` method cannot be overridden by any subclass. This ensures that the behavior of the method remains consistent.

**Example:**

```java
class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void display() { } // This will cause a compilation error
}
```

In this example, the `display()` method in the `Parent` class is marked as `final`, so it cannot be overridden by the `Child` class.

### 3. Final Classes

A `final` class cannot be extended or subclassed. This is used to prevent other classes from inheriting the behavior of the final class.

**Example:**

```java
final class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

// class AdvancedCalculator extends Calculator { } // This will cause a compilation error
```

In this case, the `Calculator` class is `final`, which means no other class can inherit from it.

---

## Differences Between `static` and `final`

| **Feature**              | **`static`**                                                     | **`final`**                                                      |
|--------------------------|------------------------------------------------------------------|------------------------------------------------------------------|
| **Purpose**               | Memory management (class-level variables and methods)           | Restricts changes (constant values, methods, and inheritance)     |
| **Applies To**            | Variables, methods, nested classes                              | Variables, methods, classes                                      |
| **Initialization**        | Static variables and methods are initialized when the class is loaded into memory | Final variables must be initialized at declaration or in the constructor |
| **Inheritance**           | Static members are inherited but not overridden                 | Final methods cannot be overridden, final classes cannot be subclassed |
| **Access**                | Can be accessed via the class name without creating an instance | Final variables or methods are instance-level unless combined with `static` |

---

## Examples

### 1. Combining `static` and `final`

You can use `static` and `final` together to define constants that are shared across all instances of a class and cannot be modified.

**Example:**

```java
class MathConstants {
    static final double PI = 3.14159;

    static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Area of circle: " + MathConstants.calculateArea(5));
    }
}
```

### 2. Abstract Classes and Anonymous Classes with `final`

Here’s an example of how you might use an abstract class and an anonymous class with `final` methods:

**Example:**

```java
abstract class PaymentProcessor {
    abstract void processPayment(double amount);
    
    final void generateReceipt() {
        System.out.println("Generating receipt...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Anonymous class implementing the abstract method
        PaymentProcessor processor = new PaymentProcessor() {
            @Override
            void processPayment(double amount) {
                System.out.println("Processing payment of $" + amount);
            }
        };
        
        processor.processPayment(100.0);
        processor.generateReceipt(); // The final method is accessible but not overrideable
    }
}
```

---

## Conclusion

- **`static`** is used for defining class-level members and sharing data across all instances.
- **`final`** restricts the behavior of variables, methods, and classes, ensuring immutability or consistent behavior across inheritance hierarchies.
  
By understanding the use cases for `static` and `final`, you can create more efficient, maintainable, and well-structured Java programs.
