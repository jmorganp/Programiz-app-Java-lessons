import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements
        languages.add("Python");
        languages.add("C");
        languages.add("Java");
        System.out.println("ArrayList: " + languages);

        // change element at index 1
        languages.set(1, "Kotlin");
        System.out.println("Updated Arraylist: " + languages);
    }
}