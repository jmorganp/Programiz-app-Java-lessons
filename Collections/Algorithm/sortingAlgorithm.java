import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Unsorted ArrayList: " + numbers);

        // sorting the arraylist
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);
    }
}