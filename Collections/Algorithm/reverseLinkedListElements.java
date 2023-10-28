import java.util.Collections;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("LinkedList: " + numbers);

        // reverse the order
        Collections.reverse(numbers);
        System.out.println("Reversed LinkedList: " + numbers);
    }
}