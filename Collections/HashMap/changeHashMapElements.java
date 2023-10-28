import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        
        // create hashmap
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "C");
        System.out.println("Original HashMap: " + languages);

        // change value associated with key 3

        languages.replace(3, "C++");
        System.out.println("Updated HashMap: " + languages);
    }
}