interface Animal {
    public void printAnimalTraits();
}

interface Mammal {
    public void printMammalTraits();
}

class Dog implements Animal, Mammal {
    // implement printAnimalTraits()
    public void printAnimalTraits() {
        System.out.println("Can eat.");
    }

    // implement printMammalTraits()
    public void printMammalTraits() {
        System.out.println("Warm blood.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.printAnimalTraits();
        dog1.printMammalTraits();
    }
}

/* Output:
 * Can eat.
 * Warm blood.
 */