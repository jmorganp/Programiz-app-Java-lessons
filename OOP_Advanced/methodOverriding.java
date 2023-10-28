class Animal {
    public void makeSound() {
        System.out.println("Making animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
    }
}

// Output: Woof woof