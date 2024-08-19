package constructors.thisissuper;
// Parent class
class Animal {
    String name;

    // Constructor of the parent class
    Animal(String name) {
        this.name = name; // 'this' refers to the current object of Animal
    }

    // Method in the parent class
    void display() {
        System.out.println("Animal name: " + name);
    }
}

// Child class
class Dog extends Animal {
    String breed;

    // Constructor of the child class
    Dog(String name, String breed) {
        super(name); // 'super' calls the constructor of the parent class
        this.breed = breed; // 'this' refers to the current object of Dog
    }

    // Overriding the display method of the parent class
    @Override
    void display() {
        super.display(); // 'super' calls the display method of the parent class
        System.out.println("Dog breed: " + breed);
    }
}


