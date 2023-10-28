import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        // add elements to ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        System.out.println("ArrayList: " + languages);

        // define an array
        String[] arr = new String[languages.size()];

        // convert ArrayList to array
        languages.toArray(arr);
        System.out.println("Array elements: " );

        // print array elements
        for (String item : arr) {
            System.out.println(item);
        }
    }
}