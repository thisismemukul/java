package methodoverriding;

// Base class
class AnimalSuper {
    // Method to be overridden by subclasses
    public void sound() {
        System.out.println("AnimalSuper sound");
    }
}

// Subclass representing a Dog
class DogSub extends AnimalSuper {
    // Overriding the sound method to provide Dog-specific behavior
    @Override
    public void sound() {
        System.out.println("DogSub sounds like Bark");
    }
}

// Subclass representing a Cat
class CatSub extends AnimalSuper {
    // Overriding the sound method to provide Cat-specific behavior
    @Override
    public void sound() {
        System.out.println("CatSub sounds like Meow");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Creating instances of each class
        AnimalSuper animal = new AnimalSuper();
        animal.sound(); // Calls the sound method of AnimalSuper

        DogSub dog = new DogSub();
        dog.sound(); // Calls the sound method of DogSub

        CatSub cat = new CatSub();
        cat.sound(); // Calls the sound method of CatSub

        // Demonstrating dynamic method dispatch
        animal = new DogSub(); // animal now refers to a DogSub instance
        animal.sound(); // Calls the sound method of DogSub due to dynamic dispatch

        animal = new CatSub(); // animal now refers to a CatSub instance
        animal.sound(); // Calls the sound method of CatSub due to dynamic dispatch
    }
}
