
// Class demonstrating Inheritance and Polymorphism by extending the OOPConcept class
class InheritanceConcept extends OOPConcept {

    private String details;

    public InheritanceConcept() {
        this.details = "Inheritance: A mechanism where one class acquires the properties and behavior of another class.";
    }

    @Override
    public void explainConcept() {
        System.out.println(details);
    }
}