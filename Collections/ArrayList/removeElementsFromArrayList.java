import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        // create ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // add elements to ArrayList
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("Java");

        // remove element at index 1
        String element = languages.remove(1);
        System.out.println("Removed Element: " + element);
        System.out.println("Updated ArrayList: " + languages);
    }
}