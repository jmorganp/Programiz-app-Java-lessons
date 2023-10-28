import java.util.Collections;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        
        // creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // search for the element 3
        int pos = Collections.binarySearch(numbers, 3);
        System.out.println("Position of 3 is " + pos);
    }
}

// Output: Position of 3 is 2