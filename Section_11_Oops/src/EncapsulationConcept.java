// Class demonstrating Inheritance by extending the OOPConcept class
class EncapsulationConcept extends OOPConcept {

    // Encapsulation: Hiding the internal state
    private String details;

    // Constructor to initialize the details
    public EncapsulationConcept() {
        this.details = "Encapsulation: Binding data and methods together.";
    }

    // Implementation of the abstract method (Abstraction)
    @Override
    public void explainConcept() {
        System.out.println(details);
    }
}