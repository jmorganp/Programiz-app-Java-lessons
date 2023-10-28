import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        // add elements
        languages.add("Python");
        languages.add("Java");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        // get the element
        String str = languages.get(1);
        System.out.println("Element at index 1: " + str);
    }
}