import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // add elements
        numbers.add(3);
        numbers.add(1);
        System.out.println("LinkedList: " + numbers);

        // add elements to first and last indexes
        numbers.addFirst(7);
        System.out.println("LinkedList after adding element at first index: " + numbers);
        numbers.addLast(8);
        System.out.println("LinkedList after adding element at last index: " + numbers);

        numbers.removeFirst();
        System.out.println("LinkedList after removing element at first index: " + numbers);
        numbers.removeLast();
        System.out.println("LinkedList after removing element at last index: " + numbers);
    }
}