import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements
        languages.add("Python");
        languages.add("C");
        languages.add("Java");
        System.out.println("ArrayList: " + languages);

        // access arraylist element
        String element = languages.get(2);
        System.out.println("Accessed Element: " + element);
    }
}