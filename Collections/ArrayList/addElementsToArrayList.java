import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        // create an ArrayList
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C");
        languages.add("Python");
        System.out.println("ArrayList: " + languages);

        // add element at the second position
        languages.add(1, "JavaScript");

        System.out.println("Updated ArrayList: " + languages);
    }
}

// Output:
// ArrayList: [Java, C, Python]
// Updated ArrayList: [Java, JavaScript, C, Python]