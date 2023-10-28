import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements
        languages.add("Python");
        languages.add("Kotlin");
        languages.add("Java");
        System.out.println("ArrayList: " + languages);

        // access elements one by one
        for (String language: languages) {
            System.out.println(language);
        }
    }
}