// Class demonstrating Inheritance and Polymorphism by extending the OOPConcept class
class PolymorphismConcept extends OOPConcept {

    private String details;

    public PolymorphismConcept() {
        this.details = "Polymorphism: The ability of a single function or method to work in different ways based on the object it is acting upon.";
    }

    @Override
    public void explainConcept() {
        System.out.println(details);
    }
}