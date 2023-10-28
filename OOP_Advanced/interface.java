// create an interface
interface Language {
    void getName(String name);
}

// implementing the interface in a class
class ProgrammingLanguage implements Language {
    // abstract method implementation
    public void getName(String name) {
        System.out.println("Language: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}

// Output: Language: Java

/*
 * In Java, an interface is a fully abstract class.
 * 
 * An interface:
 *  contains abstract methods.
 *  cannot contain fields
 * 
 * All the abstract methods defined in the interface must be implemented by its subclasses.
 * 
 * Basically, an interface defines a set of specifications (abstract methods) that other
 * classes must implement; they are similar to protocols.
 * 
 * we use the 'implement' keyword to implement interfaces.
 */