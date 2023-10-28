import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        // create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(5, "Java");
        languages.put(10, "Python");
        languages.put(15, "JavaScript");

        // iterate through keys only
        System.out.println("Elements: ");
        for (Integer key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}