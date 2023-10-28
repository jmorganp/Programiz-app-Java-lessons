import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        // create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // add elements
        languages.add("Java");
        languages.add("C");
        languages.add("JavaScript");
        System.out.println("LinkedList: " + languages);

        // add elements at the specified index
        languages.add(1, "Python");
        System.out.println("Updated LinkedList: " + languages);
    }
}