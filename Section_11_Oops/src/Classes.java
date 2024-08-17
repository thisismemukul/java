public class Classes {

    // Encapsulation: Hiding the internal state and requiring all interactions to be performed through an object's methods
    private String conceptName;

    // Constructor to initialize the concept name
    public Classes() {
        this.conceptName = "Object-Oriented Programming Concepts";
    }

    // Getter method (part of encapsulation)
    public String getConceptName() {
        return conceptName;
    }

    // Method to demonstrate the OOP concepts
    public void oopsConcepts() {
        System.out.println("1. Encapsulation: Binding data and methods that manipulate the data together.");
        System.out.println("2. Inheritance: A mechanism where one class acquires the properties and behavior of another class.");
        System.out.println("3. Polymorphism: The ability of a single function or method to work in different ways based on the object it is acting upon.");
        System.out.println("4. Abstraction: Hiding complex implementation details and showing only the necessary features.");

        // Polymorphism: OOPConcept reference holding different subclass objects
        OOPConcept encapsulation = new EncapsulationConcept();
        OOPConcept inheritance = new InheritanceConcept();
        OOPConcept polymorphism = new PolymorphismConcept();

        // Demonstrating Polymorphism: Same method called on different types of objects
        encapsulation.explainConcept();
        inheritance.explainConcept();
        polymorphism.explainConcept();
    }
}