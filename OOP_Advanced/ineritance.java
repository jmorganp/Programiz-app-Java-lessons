class Animal {
    String name;

    public void eat() {
        System.out.println("I am an animal");
        System.out.println("I can eat");
    }
}

class Dog extends Animal {
    public void display() {
        System.out.println("My name is " + name);
    }
}

class Main {
    public static void main(String[] args) {
        // create an object of the subclass
        Dog dog1 = new Dog();

        // access inherited superclass members
        dog1.name = "Fenton";
        dog1.eat();

        dog1.display();
    }
}