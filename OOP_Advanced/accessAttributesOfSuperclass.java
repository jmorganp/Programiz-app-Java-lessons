
class Animal {
    String name = "unknown";
}

class Dog extends Animal {
    // attribute with the same name
    String name = "Piper";

    public void display() {

        // print name field of its class
        System.out.println("name (Dog class): " + name); // Piper

        // print name field of the superclass
        System.out.println("name (Animal class): " + super.name); // Unknown
    }
}
class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.display();
    }
}
