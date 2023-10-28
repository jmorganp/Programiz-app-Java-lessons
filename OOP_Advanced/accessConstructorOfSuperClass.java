class Animal {
    // constructor
    Animal(String type) {
        System.out.println("Type: " + type);
    }
}

class Dog extends Animal {

    // constructor
    Dog() {
        // calls the constructor of Animal
        super("Mammal");
        System.out.println("I am a Dog");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
    }
}

// Output:
// Type: Mammal
// I am a Dog

/*
 * Note: the "super()" should always be the first statement inside
 * the constructor (of a subclass)
 */